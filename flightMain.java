import java.util.*;
import java.util.concurrent.*;

public class flightMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.print("Enter Source: ");
        String source = scanner.nextLine();
        System.out.print("Enter Destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        List<CallableTask> tasks = new ArrayList<>();
        
        // Creating service instances
        flightService indigoService = new IndigoServices();
        flightService airIndiaService = new AirIndiaServices();
        flightService akasaService = new AkasaService();

        // Adding tasks to call flights from different services
        tasks.add(new CallableTask(source, destination, date, indigoService));
        tasks.add(new CallableTask(source, destination, date, airIndiaService));
        tasks.add(new CallableTask(source, destination, date, akasaService));

        // Creating an ExecutorService with a fixed thread pool of 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submitting tasks and collecting futures
        List<Future<List<FlightData>>> results = new ArrayList<>();
        for (CallableTask task : tasks) {
            results.add(executorService.submit(task));
        }

        // Retrieving results from futures
        results.forEach(future -> {
            try {
                System.out.println(future.get()); // Get the flight data list from each airline
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        // Shutting down executor
        executorService.shutdown();
    }
}


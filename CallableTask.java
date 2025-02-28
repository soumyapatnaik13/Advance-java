import java.util.List;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<List<FlightData>> {
    private String source;
    private String destination;
    private String date;
    private flightService flightService;

    public CallableTask(String source, String destination, String date, flightService flightService) {
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.flightService = flightService;
    }

    @Override
    public List<FlightData> call() {
        return flightService.getFlights(source, destination, date);
    }
}

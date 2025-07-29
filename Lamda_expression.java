public class Lamda_expression {
    public static void main(String[] args) {
        // Example of a lambda expression to create a thread
        Runnable task = () -> {
            System.out.println("Hello from a thread using lambda expression!");
        };

        // Start the thread
        Thread thread = new Thread(task);
        thread.start();
    }
}

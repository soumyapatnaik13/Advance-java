package Multithreading;
import java.util.concurrent.*;
public class threadpool {
 
    public static void main(String[] args) {
        try (ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,  // Core pool size
                4,  // Maximum pool size
                1,  // Keep alive time (seconds)
                TimeUnit.SECONDS,  // Time unit for keep alive time
                new LinkedBlockingQueue<>()  // Task queue
        )) {
            // Submit 5 tasks to the executor
            for (int i = 1; i <= 5; i++) {
                final int taskId = i;
                executor.execute(() -> {
                    System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);  // Simulating a task that takes 1 second to complete
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Task " + taskId + " completed by " + Thread.currentThread().getName());
                });
            }

            // Gracefully shut down the executor after all tasks are completed
            executor.shutdown();
        }
    }

}

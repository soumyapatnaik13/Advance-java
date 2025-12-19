package Multithreading;

public class test {
    public static void main (String []args){
        // Example 1: Using Thread1 class that extends Thread
        Thread1 t1 = new Thread1();
        t1.start();
        usingRunnable t = new usingRunnable(); 
        
        Thread thread2 = new Thread(t);
        thread2.start();

        /* ---------------------------------------
         * class Thread implements Runnable {
         *
         *     private Runnable target;
         *
         *     public Thread(Runnable target) {
         *         this.target = target;
         *     }
         *
         *     @Override
         *     public void run() {
         *         // If a Runnable was passed
         *         if (target != null) {
         *             target.run();   // delegates the call
         *         }
         *     }
         * 
         *     public synchronized void start() {
         *         // JVM creates a NEW thread here
         *         // THEN calls run() of this Thread object
         *     }
         * }
         * ---------------------------------------
         */

        for (int i = 0; i < 50; i++) {
            System.out.println("main thread is running");
        }
    }
}
class producer extends Thread {
    SharedBuffer container;

    producer(SharedBuffer container) {
        this.container = container;
    }
    @Override
    public void run() {
        int product = 1;
        for (int i = product; i <= 10; i++) {
            container.produceProduct(i);
            System.out.println("Produced: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//without flag it would create race condition which led to code ambiguity
class consumer extends Thread {
    SharedBuffer container;

    consumer(SharedBuffer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            int val = container.consumerProduct();
            System.out.println("Consumed: " + val);
            try {
                Thread.sleep(500); // Simulate consumption time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SharedBuffer {
    int buffer;
    boolean isProduced = false;

    synchronized public void produceProduct(int val) {
        while (isProduced) {
            try {
                wait(); // Wait until the buffer is consumed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer = val;
        isProduced = true;
        notify(); 
    }

    synchronized public int consumerProduct() {
        while (!isProduced) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isProduced = false;
        notify(); // Notify the producer
        return buffer;
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer();

        producer p1 = new producer(sharedBuffer);
        consumer c1 = new consumer(sharedBuffer);

        p1.start();
        c1.start();
    }
}

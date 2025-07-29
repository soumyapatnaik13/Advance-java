public class multiThreadingWithOutSync {

    // Make the method static
    public static synchronized void PrintBrackets(char open, char close) {
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                System.out.print(open);
            } else {
                System.out.print(close);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    PrintBrackets('(', ')');
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    PrintBrackets('{', '}');
                }
            }
        });
        t1.start();
        t2.start();
    }
}

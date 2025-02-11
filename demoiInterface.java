
public class demoiInterface {
    public static void main(String[] args) {
        // Lambda expression implementing the functional interface
        calc c1 = (a, b) -> System.out.println("Sum: " + (a + b));
        
        // Calling the method
        c1.demo(12, 14);
    }
}

public class Exception {
    public static void main(String[] args) {
        try {
            
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            
            System.out.println("Execution completed.");
        }
    }

    
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}

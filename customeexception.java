
class FibonacciException extends Exception {
    public FibonacciException(String msg) {
        super(msg);
    }
}

public class customexception  {
    public static int fibonacci(int n) throws FibonacciException {
        if (n < 0) {
            throw new FibonacciException("Input cannot be negative");
        } else if (n <= 1) {
            return n;
        } else {
            int a = 0;
            int b = 1;
            int result = 0;
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        try {
            
            int n=10;
            int result = fibonacci(n);
            System.out.println("Fibonacci = " + result);
        } catch (FibonacciException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10; // Example: Find the first 10 Fibonacci numbers
        System.out.println("Fibonacci series up to " + n + ": " + fibonacci(n));
    }

    public static String fibonacci(int n) {
        if (n <= 0) return "";
        if (n == 1) return "0";

        StringBuilder sb = new StringBuilder();
        int a = 0, b = 1;
        sb.append(a).append(", ").append(b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            sb.append(", ").append(next);
            a = b;
            b = next;
        }

        return sb.toString();
    }
}

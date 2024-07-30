public class PerfectNumberChecker {
    public static void main(String[] args) {
        int number = 28; // Example number to check
        boolean isPerfect = isPerfectNumber(number);
        System.out.println(number + " is a perfect number: " + isPerfect);
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false; // Perfect numbers must be positive
        }

        int sum = 0;
        // Find the sum of proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // A number is perfect if the sum of its proper divisors is equal to the number itself
        return sum == num;
    }
}

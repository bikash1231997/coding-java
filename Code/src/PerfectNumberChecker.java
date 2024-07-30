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

         // Use IntStream to calculate the sum of proper divisors
        int sum = IntStream.rangeClosed(1, num / 2)
                           .filter(i -> num % i == 0)
                           .sum();
        /*
        Use IntStream.rangeClosed:

Create a stream of integers from 1 to num / 2, inclusive. This represents the range of potential proper divisors.
Sum the Divisors:

Use .sum() to calculate the total sum of the filtered divisors.
Check Perfection:

Compare the sum of divisors to the original number to determine if it is perfect.
        */

        // A number is perfect if the sum of its proper divisors is equal to the number itself
        return sum == num;
    }
}

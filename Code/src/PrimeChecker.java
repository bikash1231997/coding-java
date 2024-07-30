public class PrimeChecker {
    public static void main(String[] args) {
        int number = 29; // Example number
        boolean isPrime = isPrime(number);
        System.out.println("Is " + number + " a prime number? " + isPrime);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (num == 2) {
            return true; // 2 is the only even prime number
        }
        if (num % 2 == 0) {
            return false; // Exclude even numbers greater than 2
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
      /* upper line remove 
     // Use IntStream.rangeClosed to create a stream of integers from 3 to the square root of the number.
     // Filter the stream to include only odd numbers (since even numbers other than 2 cannot be prime).
     // Use noneMatch to check if none of the numbers in the stream divide the given number evenly.
      return IntStream.rangeClosed(3, (int) Math.sqrt(num))
                        .filter(n -> n % 2 != 0) // Only check odd numbers
                        .noneMatch(n -> num % n == 0);
      */
        return true;
    }
}

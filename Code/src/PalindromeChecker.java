public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "radar";
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Is the string \"" + input + "\" a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        String sanitized = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return IntStream.range(0, sanitized.length() / 2)
                        .allMatch(i -> sanitized.charAt(i) == sanitized.charAt(sanitized.length() - 1 - i));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

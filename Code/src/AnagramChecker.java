import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + isAnagram);
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays, sort them, and compare
        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        return Arrays.equals(str1Chars, str2Chars);
    }
}

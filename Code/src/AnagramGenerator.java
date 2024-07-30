import java.util.ArrayList;
import java.util.List;

public class AnagramGenerator {
    public static void main(String[] args) {
        String input = "abc";
        List<String> anagrams = generateAnagrams(input);
        System.out.println("Anagrams of " + input + ": " + anagrams);
    }

    public static List<String> generateAnagrams(String str) {
        List<String> result = new ArrayList<>();
        permute(str, 0, str.length() - 1, result);
        return result;
    }

 /*       public static List<String> generateAnagrams(String str) {
        List<String> result = new ArrayList<>();
        permute(str, "", result);
        return result.stream().distinct().collect(Collectors.toList());
    }
    private static void permute(String str, String prefix, List<String> result) {
        int n = str.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            IntStream.range(0, n).forEach(i -> 
                permute(str.substring(0, i) + str.substring(i + 1, n), prefix + str.charAt(i), result)
            );
        }
    } */

    private static void permute(String str, int left, int right, List<String> result) {
        if (left == right) {
            result.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right, result);
                str = swap(str, left, i); // backtrack
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

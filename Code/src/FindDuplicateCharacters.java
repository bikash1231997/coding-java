import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        Set<Character> duplicates = findDuplicates(input);
        System.out.println("Duplicate characters:");
        for (Character ch : duplicates) {
            System.out.println(ch);
        }
    }

    public static Set<Character> findDuplicates(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        Set<Character> duplicates = new HashSet<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find characters that appear more than once
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }
}

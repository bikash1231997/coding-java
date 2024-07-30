import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        Set<Character> uniqueChars = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.toCollection(LinkedHashSet::new)); // Preserve insertion order

        return uniqueChars.stream()
                          .map(String::valueOf)
                          .collect(Collectors.joining());
    }
}
// using set
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seen.add(c)) { // `add` returns `true` if the item was not present in the set
                result.append(c);
            }
        }

        return result.toString();
    }
}


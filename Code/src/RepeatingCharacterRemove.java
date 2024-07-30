import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatingCharacterRemove {
    public static void main(String[] args) {
        char[] input = {'a', 'b', 'c', 'a', 'b', 'd'};
        char[] uniqueChars = removeRepeatingCharacters(input);
        System.out.println("Original array: " + Arrays.toString(input));
        System.out.println("Array with unique characters: " + Arrays.toString(uniqueChars));
    }

    public static char[] removeRepeatingCharacters(char[] input) {
      // LinkedHashSet is used to maintain the order of elements & ensuring that only unique elements are kept.
        Set<Character> uniqueSet = new LinkedHashSet<>();
        
        for (char c : input) {
            uniqueSet.add(c);
        }

        // Convert the set back to a character array
        return uniqueSet.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining())
                        .toCharArray();
    }
}

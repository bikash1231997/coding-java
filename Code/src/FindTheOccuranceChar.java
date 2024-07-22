import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * FindTheOccuranceChar
 */
public class FindTheOccuranceChar {

    public static void main(String[] args) {
        String s = "barking bird is nothing";

        char[] charArray = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : charArray) {
            if (map.get(c) != null) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        map.forEach((t, u) -> System.out.println("key " + t + " value " + u));

                Map<Character, Long> map = s.chars()
                                    .mapToObj(c -> (char) c)
                                    .collect(Collectors.groupingBy(
                                        Function.identity(), 
                                        LinkedHashMap::new, 
                                        Collectors.counting()
                                    ));
        // Code for remove Duplicate Chars from string
        String b = map.keySet().stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(b);
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {
        // Sample map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "banana");
        map.put(2, "apple");
        map.put(3, "cherry");
        map.put(4, "date");

        // Sort the map by values
        Map<Integer, String> sortedMap = sortByValue(map);

        // Print the sorted map
        System.out.println("Map sorted by value:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static Map<Integer, String> sortByValue(Map<Integer, String> map) {
        return map.entrySet()
                  .stream()
                  .sorted(Map.Entry.comparingByValue())
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1,
                      LinkedHashMap::new
                  ));
    }
}

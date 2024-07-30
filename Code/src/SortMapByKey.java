import java.util.*;
import java.util.stream.Collectors;

public class SortMapByKey {
    public static void main(String[] args) {
        // Sample map
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "cherry");
        map.put(1, "banana");
        map.put(4, "date");
        map.put(2, "apple");

        // Sort the map by keys
        Map<Integer, String> sortedMap = sortByKey(map);

        // Print the sorted map
        System.out.println("Map sorted by key:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static Map<Integer, String> sortByKey(Map<Integer, String> map) {
        return map.entrySet()
                  .stream()
                  .sorted(Map.Entry.comparingByKey())
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1,
                      LinkedHashMap::new
                  ));
    }
}

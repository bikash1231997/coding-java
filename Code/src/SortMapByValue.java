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

/*
Convert Map Entries to Stream:

map.entrySet().stream() creates a stream of the map's entries.
Sort Entries:

sorted(Map.Entry.comparingByValue()) sorts the stream based on the map's values. Map.Entry.comparingByValue() provides a comparator that compares map entries by their values.
Collect Sorted Entries into a LinkedHashMap:

Collectors.toMap(...) collects the sorted entries into a new map.
Map.Entry::getKey extracts the keys.
Map.Entry::getValue extracts the values.
(e1, e2) -> e1 resolves conflicts, but there should be no conflicts in this case.
LinkedHashMap::new creates a LinkedHashMap to maintain the insertion order of the sorted entries.

    */

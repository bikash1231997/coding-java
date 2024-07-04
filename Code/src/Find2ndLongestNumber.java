import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find2ndLongestNumber {
    public static void main(String[] args) {
        System.out.println("hello");
        int a[] = { 1, 2, 3, 6, 75, 9, 81, 23, 45, 22 };

        // // Using Inbuild function
        // Arrays.sort(a);
        // System.out.println(a[a.length-2]);

        // using Collection
        List<Integer> b = Arrays.stream(a).boxed().toList();
        Collections.sort(b);
        int c = b.get(b.size() - 2);
        System.out.println(c);
    }
}

/**
 * Twosum
 */
import java.util.Arrays;
import java.util.HashMap;

public class Twosum {

    public static void main(String[] args) {
        int target = 10;
        int[] abc = { 4, 3, 9, 8, 7, 2 };
        int[] twoSum = twoSum(abc, target);
        System.out.println(Arrays.toString(twoSum));
        int[] twoSum2 = twoSumApproach(abc, target);
        System.out.println(Arrays.toString(twoSum2));
    }
    public static int[] twoSumApproach(int[] abc, int target) {
        HashMap<Integer, Integer> test = new HashMap<>();
        for (int i = 0; i < abc.length; i++) {
            test.put(abc[i], i);
        }
        for (int i = 0; i < abc.length; i++) {
            int sub = target - abc[i];
            if (test.containsKey(sub)) {
                return new int[]{sub, abc[i]};
            }
        }
        return abc;
    }

    public static int[] twoSum(int[] abc, int target) {
        for (int i = 0; i < abc.length; i++) {
            for (int j = i+1; j < abc.length; j++) {
                if (abc[i]+abc[j] == target) {
                    return new int[]{abc[i], abc[j]};
                }
            }
        }
        return abc;
    }
}

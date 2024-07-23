public class TwoSum {

    public static void main(String[] args) {
        int target = -5;
        int[] test = { -3, -2, 0, 3, 5, 8 };

        int[] a = optimizeApproach(test, target);
        System.out.println(Arrays.toString(a));
    }

    private static int[] optimizeApproach(int[] test, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < test.length; i++) {
            map.put(test[i], i);
        }
        for (int i = 0; i < test.length; i++) {
            int sub = target - test[i];
            if (map.containsKey(sub)) {
                return new int[] { i, map.get(sub) };
            }
        }
        return test;
    }
}

// O(n2)
/*
Sorting: The array is sorted to efficiently find triplets using the two-pointer technique. Sorting takes 𝑂(𝑛log𝑛) O(nlogn) time.
Outer Loop: Iterate through each element. Skip duplicates to avoid processing the same value multiple times for the first element.
Two Pointers:
Initialize left to the position right after the current element.
Initialize right to the end of the array.
Adjust left and right based on the sum compared to the target.
Skip Duplicates:
After finding a valid triplet, skip over any duplicate values to ensure that only unique triplets are added.
Time Complexity: The algorithm runs in 
𝑂(𝑛2)O(n2) time because sorting takes 𝑂
(𝑛log𝑛)O(nlogn) and the two-pointer technique runs in 𝑂(𝑛) O(n) for each element.
    */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumWithTarget {
    public static void main(String[] args) {
        int[] nums = {1, 2, -1, -1, -4, 2};
        int target = 2;
        List<List<Integer>> result = threeSumWithTarget(nums, target);
        System.out.println("Triplets that sum to " + target + ":");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    public static List<List<Integer>> threeSumWithTarget(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Initialize two pointers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicate values
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}

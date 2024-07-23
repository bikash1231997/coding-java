// Maximum Ascending Subarray Sum
// https://leetcode.com/problems/maximum-ascending-subarray-sum/description/
// Input: nums = [10,20,30,5,10,50] Output: 65 Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
class Solution {
    private static int maxAscendingSum;

    public int maxAscendingSum(int[] nums) {
        int result = Integer.MIN_VALUE;
        int sumAyyay = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                sumAyyay = sumAyyay + nums[i];
            } else {
                result = Math.max(result, sumAyyay);
                sumAyyay = nums[i];
            }
        }
        result = Math.max(result, sumAyyay);
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { 10, 20, 30, 5, 10, 50 };
        int maxAscendingSum = s.maxAscendingSum(nums);
        System.out.println(maxAscendingSum);
    }
}

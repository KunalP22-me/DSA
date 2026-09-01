//Problem 494 leetcode
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, 0, 0, target);
    }

    private int helper(int[] nums, int index, int sum, int target) {

        if (index == nums.length) {
            if (sum == target) {
                return 1; // valid
            }
            return 0; // invalid
        }

        // Add current number
        int plus = helper(nums, index + 1, sum + nums[index], target);

        // Subtract current number
        int minus = helper(nums, index + 1, sum - nums[index], target);

        // Total valid ways
        return plus + minus;
    }
}

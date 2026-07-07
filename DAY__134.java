//Problem 55 Leetcode
class Solution {
    public boolean canJump(int[] nums) {

        // Initially, the goal is the last index.
        int goal = nums.length - 1;

        // Traverse from right to left.
        for (int i = nums.length - 2; i >= 0; i--) {

            // If we can reach the current goal from index i,
            // move the goal to i.
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        // If the goal has moved back to index 0,
        // we can reach the last index.
        return goal == 0;
    }
}

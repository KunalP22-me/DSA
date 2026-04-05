//Problem 268 Leetcode
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < nums.length; i++)
        {
            n ^= i;
            n ^= nums[i];
        }

        return n;
    }
}

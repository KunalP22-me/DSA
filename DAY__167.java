//Problem 3702 Leetcode
class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int zero = 0;

        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];

            if (zero == 0 && nums[i] > 0) {
                zero++;
            }
        }

        if (zero == 0) {
            return 0;
        }
        
        if (xor > 0) {
            return nums.length;
        }

        return nums.length - 1;
    }
}

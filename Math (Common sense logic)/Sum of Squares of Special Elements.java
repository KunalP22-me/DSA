//Problem 2778 Leetcode
class Solution {
    public int sumOfSquares(int[] nums) {
        int sss = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0)  sss += nums[i] * nums[i];
        }
        return sss;
    }
}

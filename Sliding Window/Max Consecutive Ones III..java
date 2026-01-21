//Problem 1004 Leetcode

class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroCount = 0;
        int res = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeroCount++;
            }

            // shrink window if zeros exceed k
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}

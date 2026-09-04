//Problem 3903 Leetcode
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] suffix = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            suffix[i] = min;
        }

        for (int j = 0; j < n; j++) {
            max = Math.max(max, nums[j]);
            int s = max - suffix[j];
            if (s <= k) {
                return j;
            }
        }
        return -1;
    }
}

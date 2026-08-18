//Problem 3471 Leetcode
class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] feq = new int[51];

        for (int a : nums)
            feq[a]++;

        int res = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            if (feq[nums[i]] == 1 && (k == 1 || i == 0 || i == n - 1)) { //last and first element have at least 1 repeat
                res = Math.max(res, nums[i]);
            }

            if (k == n) {
                res = Math.max(res, nums[i]);
            }

        }
        return res;
    }
}

//Problem 1498 leetcode
class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        int i = 0;
        int j = n - 1;
        long c = 0;

        int mod = 1000000007;

        // Precompute powers of 2
        long[] pow = new long[n];
        pow[0] = 1;

        for (int k = 1; k < n; k++) {
            pow[k] = (pow[k - 1] * 2) % mod;
        }

        while (i <= j) {

            if (nums[i] + nums[j] <= target) {

                // All elements between i and j can either be
                // selected or not selected.
                c = (c + pow[j - i]) % mod;

                i++;

            } else {
                j--;
            }
        }

        return (int)c;
    }
}

//Problem 3467 Leetcode
class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int ec = 0;

        for (int j = 0; j < n; j++) {
            if (nums[j] % 2 == 0)
                ec++;
        }

        for (int l = 0; l < ec; l++) {
            nums[l] = 0;
        }

        for (int p = ec; p < n; p++) {
            nums[p] = 1;
        }

        return nums;
    }
}

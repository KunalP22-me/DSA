//Problem 34 Leetcode

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int[] w = { -1, -1 };

        while (l < nums.length || r >= 0) {

            if (l < nums.length && nums[l] == target) {
                if (w[0] == -1)
                    w[0] = l;
            }

            if (r >= 0 && nums[r] == target) {
                if (w[1] == -1)
                    w[1] = r;
            }

            l++;
            r--;
        }
        return w;

    }
}

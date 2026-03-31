//Problem 33 Leetcode

class Solution {
    public int search(int[] nums, int t) {

        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int m = (l + h) / 2;

            if(nums[m]==t) return m;

            if (nums[m] >= nums[l]) {
                if (t >= nums[l] && t < nums[m]) {
                    h = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                if (t <= nums[h] && t > nums[m]) {
                    l = m + 1;
                } else {
                    h = m - 1;
                }
            }

        }
        return -1;
    }
}

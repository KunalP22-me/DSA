//Problem 2161 Leetcode

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];

        int l = 0;
        int r = n - 1;

        int i = 0;
        int j = n - 1;

        while (i < n) {
            // Put elements smaller than pivot from left side
            if (nums[i] < pivot) {
                ans[l] = nums[i];
                l++;
            }

            // Put elements greater than pivot from right side
            if (nums[j] > pivot) {
                ans[r] = nums[j];
                r--;
            }

            i++;
            j--;
        }

        // Fill remaining positions with pivot
        while (l <= r) {
            ans[l] = pivot;
            l++;
        }

        return ans;
    }
}

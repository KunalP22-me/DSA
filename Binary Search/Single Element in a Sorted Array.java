//Problem 540 Leetcode
class Solution {
    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;

        int low = 0;
        int high = n - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Make mid even
            if (mid % 2 == 1)
                mid--;

            // Pair is valid, single lies on right
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            }
            // Pair breaks, single lies on left (or at mid)
            else {
                high = mid;
            }
        }

        return nums[low];
    }
}

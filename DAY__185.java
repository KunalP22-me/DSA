//Problem 2091 Leetcode
class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        if (n <= 2)
            return n;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int minIndex = 0; 
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            
            if (nums[i] < min) {
                minIndex = i;
                min = nums[i];
            }

            if (nums[i] > max) {
                maxIndex = i;
                max = nums[i];
            }
        }

        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        //front
        int f = right + 1;

        //back
        int b = n - left;

        //each side
        int fb = (left + 1) + (n - right);

        return Math.min(f, Math.min(b, fb));
    }
}

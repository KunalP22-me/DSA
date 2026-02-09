//Problem 918 Leetcode

class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int minbe= nums[0];
        int maxbe= nums[0];
        int minans= nums[0];
        int maxans= nums[0];
        int sum= nums[0];

        for(int i=1; i<nums.length; i++){
            sum += nums[i];

            maxbe=Math.max(maxbe+nums[i], nums[i]);
            maxans=Math.max(maxbe,maxans);

            minbe=Math.min(nums[i], minbe+nums[i]);
            minans=Math.min(minbe,minans);
        }
        if (maxans < 0) return maxans;

        return Math.max(maxans, sum - minans);
    }
}

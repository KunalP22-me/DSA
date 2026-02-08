//Problem 1749 Leetcode

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxend =0, maxsum=0;
        int minend =0, minsum=0;

        for(int i=0; i<nums.length; i++){

            maxend=Math.max(nums[i], maxend+nums[i]);            
            minend=Math.min(nums[i], minend+nums[i]);            

            maxsum=Math.max(maxsum, maxend);            
            minsum=Math.min(minsum, minend);            
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}

//Problem 53 Leetcode

class Solution {
    public int maxSubArray(int[] nums) {

        int i= 0;
        int be= nums[0];
        int ans= nums[0];

        for(i=1; i<nums.length; i++){
            int v1 = be+nums[i];
            int v2 = nums[i];

            be=Math.max(v1,v2);

            ans=Math.max(ans,be);
        }
        return ans;

    }
}

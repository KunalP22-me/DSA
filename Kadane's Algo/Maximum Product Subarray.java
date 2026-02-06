//Problem 152 Leetcode

class Solution {
    public int maxProduct(int[] nums) {

        int i= 0;
        int be= nums[0];
        int we= nums[0];
        int ans= nums[0];

        for(i=1; i<nums.length; i++){

            int v1 = be*nums[i];
            int v2 = we*nums[i];
            int v3 = nums[i];

            be=Math.max(v1,Math.max(v2,v3));
            we=Math.min(v1,Math.min(v2,v3));

            ans=Math.max(ans,Math.max(be,we));
        }
        return ans;
    }
}

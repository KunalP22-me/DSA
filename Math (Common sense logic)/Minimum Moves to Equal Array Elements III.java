//Problem 3736 Leetcode
class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        int t = nums[0];
        
        for(int i=0;i<nums.length;i++){
            t= Math.max(t,nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            ans+= t-nums[i];
        }

        return ans;
    }
}

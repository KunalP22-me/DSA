//Problem 724 Leetcode

class Solution {
    public int pivotIndex(int[] nums) {

        int n=nums.length;
        int l = 0;
        int sum = 0;

        for(int j=0; j<n; j++){
            sum = sum+nums[j];
        }

        for(int i=0; i<n; i++){
            int r= sum-nums[i]-l;

            if(l == r) return i;
            
            l = l+nums[i];
        }
        return -1;
    }
}

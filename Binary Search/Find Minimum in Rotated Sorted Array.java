//Problem 153 Leetcode

class Solution {
    public int findMin(int[] nums) {

        int n =nums.length;
        int l=0;
        int h=n-1;
        int res=-1;

        while(l<=h){    
            int m = (l+h)/2;
                if(nums[m]>nums[n-1]) l=m+1;
                else{
                    h=m-1;
                    res=nums[m];
                }
            
        }
        return res;
    }
}  

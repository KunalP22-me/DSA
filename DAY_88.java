//Problem 162 Leetcode

class Solution {
    public int findPeakElement(int[] nums) {
        int n= nums.length;

        int l=0;
        int h=n-1;
        int m=0;

        while(l<h){
            m = (l+h)/2;

            if(nums[m]>nums[m+1]) h=m;
            else l=m+1;
        }
        return l;
    }
}

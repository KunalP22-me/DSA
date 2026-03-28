//Problem 704 Leetcode

class Solution {
    public int search(int[] nums, int t) {
        int n = nums.length;
        int l= 0;
        int h= n-1;
        int m;

        while(l<=h){
            m=(l+h)/2;

            if(nums[m]<t) l=m+1;
            if(nums[m]>t) h=m-1;
            if(nums[m]==t) return m; 
        }
        return -1;
    }
}

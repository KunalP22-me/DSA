// Problem 713 Leetcode

class Solution { 
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         
        if(k<=1) return 0;
        
        int c =0;
        int i =0;
        int p =1;
        

        for(int j =0; j<nums.length; j++){
            p=p*nums[j];

            while(p >= k){
                p /=nums[i];
                i++;
            }
            c=c+j-i+1;
        }
        return c;
    }
}

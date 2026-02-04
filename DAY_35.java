//Problem 287 Leetcode

class Solution {
    public int findDuplicate(int[] nums) {
        int s=0;
        int f=0;

        //cycle finding
        while(true){
            s =nums[s];
            f =nums[ nums[f] ];
            if(s==f) break;
        }

        //then strting point of cycle
        s=0;
        while(s!=f){
            s=nums[s];
            f=nums[f];
        }
        return s;
    } 
}

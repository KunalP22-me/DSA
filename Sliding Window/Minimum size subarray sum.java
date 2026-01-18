//Problem 209 Leetcode

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int h=0;
        int res=Integer.MAX_VALUE;
        int sum =0;

        while(h<nums.length){
            sum = sum + nums[h];

            while(sum>=target){
                int o=h-l+1;
                res=Math.min(res,o);
                sum = sum - nums[l++];
            }
            h++;
        }

        return res==Integer.MAX_VALUE ? 0 : res;
      //return condition ? value_if_true : value_if_false
    }
}

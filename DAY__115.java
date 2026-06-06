//Problem 2574 Leetcode

class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;

        int[] ls_arr = new int[n];
        int[] rs_arr = new int[n];
        int[] res = new int[n];

        ls_arr[0]=0;
        rs_arr[n-1]=0;

        for(int i = 1; i < n; i++){
            ls_arr[i] = ls_arr[i - 1] + nums[i - 1];
        }

        for(int i = n - 2; i >= 0; i--){
            rs_arr[i] = rs_arr[i + 1] + nums[i + 1];
        }

        for(int i = 0; i < n; i++){
            res[i] = Math.abs(ls_arr[i] - rs_arr[i]);
        }

        return res;
    }
}

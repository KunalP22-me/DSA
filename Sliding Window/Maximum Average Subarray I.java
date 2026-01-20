//Problem 643 Leetcode

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum =0;
        int l=0;
        int h=k;
        for(int i=0; i<k; i++){
            sum = sum + nums[i];
        }

        double avg = sum/k;
        double max = avg;
        for(int n=k; n<nums.length; n++){
            sum = sum - nums[l++] +nums[h++]; 
            avg = sum/k;
            max = Math.max(max,avg);
        }
        return max;
    }
}

///Problem 3300 Leetcode

class Solution {
    public int minElement(int[] nums) {
        int res = 100000;

        for(int i = 0; i<nums.length; i++){
            int d  = nums[i];
            int temp = getSum(d);
            res= Math.min(temp, res);
       }
       return res;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }
}

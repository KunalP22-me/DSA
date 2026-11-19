//Problem 2567 Leetcode
class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        if(n==3) return 0;

        Arrays.sort(nums);

        int low = 0;
        int high = nums[n-2]-nums[1];
        int opt1= low + high;

        // opt2
        low =0;
        high = nums[n-3]-nums[0];
        int opt2 = low + high;

        // opt3
        low =0;
        high = nums[n-1]-nums[2];
        int opt3 = low + high;


        return Math.min(opt1, Math.min(opt2, opt3));
    }
}

//Problem 3867 Leetcode

class Solution {
    public long gcdSum(int[] nums) {

        int n = nums.length;
        int[] pg = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(nums[i], max);
            pg[i] = gcd(nums[i], max);
        }

        Arrays.sort(pg);

        long sum = 0;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            sum = sum + gcd(pg[i], pg[j]);
            i++;
            j--;
        }
        return sum;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

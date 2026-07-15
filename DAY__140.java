// Problem 3658 Leetcode

class Solution {
    public int gcdOfOddEvenSums(int n) {
        if (n == 1) {
            return 1;
        }
        int oddSum = n * n;
        int evenSum = n * (n + 1);
        int result = GCD(oddSum, evenSum);
        return result;
    }

    private int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

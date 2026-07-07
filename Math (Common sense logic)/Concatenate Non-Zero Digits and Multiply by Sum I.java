//Problem 3754 Leetcode
class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int x = 0;
        int len = 1;
        while (n > 0) {
            int d = n % 10;
            if (d != 0) {
                x = d * len + x;
                len = len * 10;
                sum = sum + d;
            }
            n = n / 10;
        }
        return (long) sum * x;
    }
}

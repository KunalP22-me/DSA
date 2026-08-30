//Problem 50 leetcode
class Solution {
    public double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
            // return fc(1/x, -1*N);
        }

        return fc(x, N);
    }

    private double fc(double x, long n) {
        
        if (n == 0) return 1;

        double half = fc(x, n / 2);

        // Even
        if (n % 2 == 0) {
            return half * half;
        }

        // Odd
        return x * half * half;
    }
}

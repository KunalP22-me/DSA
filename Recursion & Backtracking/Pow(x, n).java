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
        if (n % 2 == 0) return half * half;
        // Odd
        return x * half * half;
    }
}


// fc(2, 10)
// │
// ├── half = fc(2, 5)
// │   │
// │   ├── half = fc(2, 2)
// │   │   │
// │   │   ├── half = fc(2, 1)
// │   │   │   │
// │   │   │   ├── half = fc(2, 0)
// │   │   │   │   │
// │   │   │   │   └── return 1
// │   │   │   │
// │   │   │   └── n = 1 (odd)
// │   │   │       return 2 × 1 × 1
// │   │   │       return 2
// │   │   │
// │   │   └── n = 2 (even)
// │   │       return 2 × 2
// │   │       return 4
// │   │
// │   └── n = 5 (odd)
// │       return 2 × 4 × 4
// │       return 32
// │
// └── n = 10 (even)
//     return 32 × 32
//     return 1024

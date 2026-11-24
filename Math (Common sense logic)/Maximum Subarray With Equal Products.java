//Problem 3411 Leetcode
class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        if (n <= 2) return n;

        for (int i = 0; i < n; i++) {
            long currentProd = 1;
            long currentGcd = 0;
            long currentLcm = 1;

            for (int j = i; j < n; j++) {
                currentProd *= nums[j];
                currentGcd = gcd(currentGcd, nums[j]);
                currentLcm = lcm(currentLcm, nums[j]);

                if (currentProd == currentLcm * currentGcd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }

                // Optimization: Stop early if product overflows or grows too large
                if (currentProd > 100000000000L) { 
                    break;
                }
            }
        }
        return maxLen;
    }

    public long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public long lcm(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a / gcd(a, b) * b);
    }
}

//Problem 3622 Leetcode
class Solution {
    public boolean checkDivisibility(int n) {
        int p = 1;
        int s = 0;
        int c = n;

        while (n != 0) {
            s += n % 10;;
            p *= n % 10;;
            n = n / 10;
        }

        if (c % (s + p) == 0)
            return true;

        return false;
    }
}

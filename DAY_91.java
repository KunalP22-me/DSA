//Problem 367 Leetcode

class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 0;
        int h = num;

        while (l <= h) {
            int m = l + (h - l) / 2;

            long sq = (long) m * m;

            if (sq == num)
                return true;

            if (sq < num)
                l = m + 1;
            else
                h = m - 1;
        }
        return false;
    }
}

//Problem 69 leetcode
class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x;
        int mid = -1;

        while (start <= end) {

            // Find middle element
            mid = start + (end - start) / 2;

            // Mid² is too large, search left half
            if ((long) mid * mid > x)
                end = mid - 1;

            // Perfect square found
            else if ((long) mid * mid == x)
                return mid;

            // Mid² is too small, search right half
            else
                start = mid + 1;
        }

        // 'end' stores the floor of √x
        return end;
    }
}

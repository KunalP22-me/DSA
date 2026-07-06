//Problem 1288 Leetcode
class Solution {
    public int removeCoveredIntervals(int[][] A) {

        // Sort by start in ascending order.
        // If starts are equal, sort by end in descending order
        // so the larger interval comes first.
        Arrays.sort(A, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);

        int res = 0;
        int r = 0;   // Maximum end seen so far

        for (int[] x : A) {

            // If current interval extends beyond the maximum end,
            // it is NOT covered by any previous interval.
            if (x[1] > r) {
                r = x[1];   // Update farthest end
                res++;      // Count this interval
            }

            // Else:
            // Current interval's end <= r
            // => It is completely covered by a previous interval.
        }

        return res;
    }
}

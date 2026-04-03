//Problem 240 Leetcode

class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
        int n = arr.length;
        int m = arr[0].length;

        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (arr[i][j] == t) return true;

            else if (arr[i][j] > t) j--;  // move left

            else i++;  // move down
        }

        return false;
    }
}

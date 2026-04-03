//Problem 240 Leetcode

class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            // Optional optimization: skip impossible rows
            if (t < arr[i][0] || t > arr[i][m - 1]) continue;

            if (binarySearch(arr[i], t)) return true;
        }

        return false;
    }

    private boolean binarySearch(int[] row, int t) {
        int l = 0, h = row.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (row[mid] == t) return true;
            else if (row[mid] < t) l = mid + 1;
            else h = mid - 1;
        }

        return false;
    }
}

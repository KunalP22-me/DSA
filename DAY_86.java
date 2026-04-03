//Problem 74 Leetcode

class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
        
        int n = arr.length;
        int m = arr[0].length;

        int l = 0;
        int h = n * m - 1;//total number of element approx

        while (l <= h) {
            int mid = (l + h) / 2;

            int row = mid / m; //logic if we divide index by no of column we get row
            int col = mid % m; //logic if we modulus index by no of column we get column

            if (arr[row][col] == t) return true;

            else if (arr[row][col] < t) l = mid + 1;

            else h = mid - 1;
        }

        return false;
    }
}

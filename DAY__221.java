//Problem 3963 Leetcode
class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];
        for (char[] row : grid) java.util.Arrays.fill(row, '#');

        int s = Math.min(m, n);

        // Step 1 & 2: Staircase diagonal + horizontal steps
        for (int k = 0; k < s; k++) {
            grid[k][k] = '.'; // diagonal cell
            if (k < s - 1)
                grid[k][k + 1] = '.'; // right-step cell
        }

        // Step 3 & 4: Straight tail after staircase ends
        if (m <= n) {
            for (int j = m; j < n; j++) // tail goes RIGHT
                grid[m - 1][j] = '.';
        } else {
            for (int i = n; i < m; i++) // tail goes DOWN
                grid[i][n - 1] = '.';
        }

        String[] result = new String[m];
        for (int i = 0; i < m; i++)
            result[i] = new String(grid[i]);
        return result;
    }
}

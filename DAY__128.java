//Problem 54 Leetcode
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int mini = 0, minj = 0; 
        int maxi = matrix.length - 1, maxj = matrix[0].length - 1;
        int turn = 0;
        List<Integer> l = new ArrayList<Integer>();
        
        while (mini <= maxi && minj <= maxj) {
            if (turn == 0) {
                for (int i = minj; i <= maxj; i++) {
                    l.add(matrix[mini][i]);
                }
                mini++;
                turn = 1;
            } 
            
            else if (turn == 1) {
                for (int i = mini; i <= maxi; i++) {
                    l.add(matrix[i][maxj]);
                }
                maxj--;
                turn = 2;
            } 
            
            else if (turn == 2) {
                for (int i = maxj; i >= minj; i--) {
                    l.add(matrix[maxi][i]);
                }
                maxi--;
                turn = 3;
            } 
            
            else if (turn == 3) {
                for (int i = maxi; i >= mini; i--) {
                    l.add(matrix[i][minj]);
                }
                minj++;
                turn = 0;
            }
        }
        return l;
    }
}

//Problem 435 Leetcode

class Solution {
    public int eraseOverlapIntervals(int[][] arr) {

        Arrays.sort(arr, (a, b) -> a[1] - b[1]); //sort by end not by strt
        int prevend = arr[0][1];
        int c = 0;

        for (int i = 1; i < arr.length; i++) {
            int currstrt = arr[i][0];

            if (currstrt < prevend) {
                c++;
            } else {
                prevend = arr[i][1]; //cureent end address 
            }
        }
        return c;
    }
}

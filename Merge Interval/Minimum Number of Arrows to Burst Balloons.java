//Problem 452 Leetcode

class Solution {
    public int findMinArrowShots(int[][] arr) {
        
        if(arr.length == 0) return 0;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        int prevend = arr[0][1];
        int a=1;

        for(int i=1; i<arr.length; i++){

            if(prevend<arr[i][0]){
                a++;
                prevend=arr[i][1];
            }
        }
        return a;
    }
}

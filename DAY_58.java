//Problem 2406 Leetcode

class Solution {
    public int minGroups(int[][] intervals) {
        int[] count = new int[1000002];
        
        for(int i = 0; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            
            count[start]++;
            count[end + 1]--;
        }
        
        int max = 0;
            
        for(int i = 1; i < 1000002; i++){
            count[i] += count[i-1];
            max = Math.max(max, count[i]);
        }
        
        return max;
    }
}

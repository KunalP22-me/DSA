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
        int current = 0;
        
        for(int i = 0; i < 1000002; i++){
            current += count[i];
            max = Math.max(max, current);
        }
        
        return max;
    }
}

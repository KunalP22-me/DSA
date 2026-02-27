//Problem 1094 Leetcode

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        int[] stops = new int[1001];
        
        for (int i = 0; i < trips.length; i++) {
            
            int passengers = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];
            
            stops[from] += passengers;  // pick up
            stops[to] -= passengers;    // drop off
        }
        
        int current = 0;
        
        for (int i = 0; i < 1001; i++) {
            current += stops[i];
            
            if (current > capacity) {
                return false;
            }
        }
        return true;
    }
}

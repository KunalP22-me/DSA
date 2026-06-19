//Problem 1732 Leetcode

class Solution {
    public int largestAltitude(int[] gain) {
        int h = 0; // Highest altitude reached so far
        int c = 0; // Current altitude

        for (int i = 0; i < gain.length; i++) {
            c = c + gain[i];      // Update current altitude
            h = Math.max(h, c);   // Track maximum altitude
        }

        return h;
    }
}

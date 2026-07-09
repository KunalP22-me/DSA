//Problem 45 Leetcode
class Solution {
    public int jump(int[] A) {
        int jumps = 0, curEnd = 0, curFarthest = 0;

        for (int i = 0; i < A.length - 1; i++) {

            // Update the farthest index reachable from current range
            curFarthest = Math.max(curFarthest, i + A[i]);

            // End of current jump range reached
            if (i == curEnd) {
                jumps++;                   // Take one more jump
                curEnd = curFarthest;      // New range ends at farthest reachable index
            }
        }

        return jumps;
    }
}

//Problem 453 Leetcode
class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i : nums) {
            min = Math.min(i, min);
        }

        int res = 0;
        for (int j : nums) {
            res += j - min;
        }

        return res;
    }
}

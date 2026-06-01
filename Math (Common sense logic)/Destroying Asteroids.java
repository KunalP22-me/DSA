//Problem 2126 Leetcode

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] as) {
        Arrays.sort(as);
        long big = mass;

        for (int i = 0; i < as.length; i++) {
            if (big >= as[i]) {
                big += as[i];
            } else {
                return false;
            }
        }
        return true;
    }
}

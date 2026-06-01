//Problem "2126" Leetcode

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] as) {

        Arrays.sort(as); // always destroy smaller asteroid first
        long big = mass; // use long to avoid overflow

        for (int i = 0; i < as.length; i++) {

            // if current mass can destroy asteroid
            if (big >= as[i]) {
                big += as[i]; // gain asteroid mass
            } 
            else {
                return false; // cannot destroy -> game over
            }
        }
        return true; // all asteroids destroyed
    }
}

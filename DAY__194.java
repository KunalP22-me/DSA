//Problem 3064 leetcode
class Solution {

    public long countCommas(long n) {
        long p = 1000, res = 0;

        // Count how many numbers have a comma at each position
        while (p <= n) {
            res += n - p + 1;

            // Move to the next comma position
            p *= 1000;
        }

        return res;
    }
}

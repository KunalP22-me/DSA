//Problem 2144 Leetcode

class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);
        int res = 0;
        int count = 0;

        // traverse from costly candies
        for (int i = cost.length - 1; i >= 0; i--) {
            count++;

            // every 3rd candy is free
            if (count % 3 == 0) {
                continue;
            }

            // add paid candies
            res += cost[i];
        }
        return res;
    }
}

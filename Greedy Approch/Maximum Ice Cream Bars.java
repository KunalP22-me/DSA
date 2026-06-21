//Problem 1833 Leetcode
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int res = 0;
        int sum = 0;

        for (int i = 0; i < costs.length; i++) {
            sum = sum + costs[i];

            // if budget exceeded, previous count was the answer
            if (sum > coins) {
                return res;
            }

            // current ice cream can be bought
            res++;

            // exact budget used
            if (sum == coins) {
                return res;
            }
        }

        return res;
    }
}

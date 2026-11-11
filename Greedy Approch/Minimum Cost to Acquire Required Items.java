//Problem 3789 Leetcode
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long cb = 0;
        long c1 = 0;
        long c2 = 0;

        cb = (long)costBoth * Math.max(need1, need2);
        c1 = (long)cost1 * need1 + (long)cost2 * need2;
        c2 = (long)costBoth * Math.min(need1, need2) + 
              (long)cost1 * Math.max(0, need1 - need2) + 
              (long)cost2 * Math.max(0, need2 - need1);

        return Math.min(cb, Math.min(c1, c2));
    }
}

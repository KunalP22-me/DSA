//Problem 134 Leetcode
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;

        for (int i = 0; i < gas.length; i++) {
            totalgas += gas[i];
            totalcost += cost[i];
        }

        if (totalgas < totalcost)
            return -1;

        int strt = 0;
        int remain = 0;

        for (int i = 0; i < gas.length; i++) {
            remain = remain + ( gas[i] - cost[i] );

            if (remain < 0) {
                strt = i + 1;
                remain = 0;
            }
        }
        return strt;
    }
}

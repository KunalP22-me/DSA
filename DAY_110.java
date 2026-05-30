//Problem 122 Leetcode

class Solution {
    public int maxProfit(int[] prices) {
        int p =0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                p=p+(prices[i]-prices[i-1]);
            }
        }
        return p;
    }
}

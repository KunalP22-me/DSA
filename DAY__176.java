//Problem 1927 Leetcode
class Solution {
    public boolean sumGame(String num) {

        int n = num.length();
        double ans=0.0;

        for(int i=0; i<n/2; i++){
            ans = ans+ check(num.charAt(i));
        }
        for(int i=n/2; i<n; i++){
            ans = ans- check(num.charAt(i));
        }

        return ans!=0.0;
    }

    private double check(char c){
        if(c=='?') return 4.5;
        return c -'0';
    }
}

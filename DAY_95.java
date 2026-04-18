//Problem 172 Leetcode

class Solution {
    public int trailingZeroes(int n) {
        
        if(n==0) return 0;

        int last = n/5;
        int ans = last + trailingZeroes(n/5);
        
        return ans;

    }
}

/*
all trailing 0 is from factors 5 * 2.

But sometimes one number may have several 5 factors, 
for example, 25 have two 5 factors, 125 have three 5 factors. 
In the n! operation, factors 2 is always ample. 
So we just count how many 5 factors in all number from 1 to n. 
*/

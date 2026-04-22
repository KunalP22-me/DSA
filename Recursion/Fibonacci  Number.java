//Problem 509 Leetcode

//Using Recursion only
class Solution {
    public int fib(int n) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int f1 = n - 1;
        int f2 = n - 2;
        return fib(f1) + fib(f2);
    }
}

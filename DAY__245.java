//Problem 3360 Leetcode
class Solution {
    public boolean canAliceWin(int n) {
        if (n <= 9)
            return false;

        if (n == 10)
            return true;

        int turn = 10;

        while (turn <= n) {
            n = n - turn;
            turn--;
        }
        return turn % 2 == 1;
    }
}

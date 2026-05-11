//Problem 22 Leetcode
//only backtracking 

class Solution {
    public List<String> generateParenthesis(int n) {
        int open = 0;
        int close = 0;
        String temp = "";
        List<String> res = new ArrayList<>();

        fun(open, close, n, temp, res);
        return res;
    }

    private void fun(int open, int close, int n, String temp, List<String> res) {

        if (open == n && close == n) {
            res.add(temp);
            return;
        }

        if (open < n) {//imp condition
            fun(open + 1, close, n, temp + "(", res);
        }

        if (close < open) {//imp condition
            fun(open, close + 1, n, temp + ")", res);
        }

        return;
    }
}

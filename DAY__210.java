//Problem 1541 Leetcode
class Solution {
    public int minInsertions(String s) {
        int ans = 0, op = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '(') {
                ++op;
            } else {
                if (i < n - 1 && s.charAt(i + 1) == ')') {
                    ++i; // consume the full "))"
                } else {
                    ++ans; // only one ')', insert another
                }
                if (op == 0) {
                    ++ans; // no '(' to match, insert one
                } else {
                    --op;
                }
            }
        }
        return ans + op * 2; // each leftover '(' needs "))"
    }
}

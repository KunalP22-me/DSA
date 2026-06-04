// Problem 3751 Leetcode
// Brute force
class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for (int x = num1; x <= num2; x++) {
            String s = String.valueOf(x);

            for (int i = 1; i < s.length() - 1; i++) {
                
                char c_minus = s.charAt(i - 1);
                char c = s.charAt(i);
                char c_plus = s.charAt(i + 1);

                if ((c > c_minus && c > c_plus) || (c < c_minus && c < c_plus)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}

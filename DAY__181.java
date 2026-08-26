//Problem 2904 leetcode
class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i = 0, o = 0;
        String ans = "";

        for (int j = 0; j < s.length(); j++) {

            if (s.charAt(j) == '1') o++;

            while (o > k) {
                if (s.charAt(i++) == '1') o--;
            }

            if (o == k) {
                while (s.charAt(i) == '0') i++;

                String curr = s.substring(i, j + 1);

                if (ans.equals("") || 
                    curr.length() < ans.length() ||
                    (curr.length() == ans.length() && curr.compareTo(ans) < 0)) {
                    ans = curr;
                }
            }
        }

        return ans;
    }
}

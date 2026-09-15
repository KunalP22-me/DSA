//Problem 58 Leetcode
class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = n - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ') {
                if (ans == 0)
                    continue;      
                else
                    return ans;   
            }
            ans++;                 
        }
        return ans;              
    }
}

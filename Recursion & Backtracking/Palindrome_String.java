//GFG Palindrome string

class Solution {
    
    boolean isPalindrome(String s) {
        return check(s, 0, s.length() - 1);
    }

    boolean check(String s, int l, int h) {

        // Base case
        if(l >= h) return true;

        // Mismatch
        if(s.charAt(l) != s.charAt(h)) {
            return false;
        }

        // Move inward
        return check(s, l + 1, h - 1);
    }
}

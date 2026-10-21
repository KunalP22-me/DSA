class Solution {
    public int minOperations(String s) {
        int n = s.length();

        if (isSorted(s)) {
            return 0;
        }

        if (n == 2) {
            return -1;
        }
        

        char mn = 'z' + 1;
        char mx = 'a' - 1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c < mn) mn = c;
            if (c > mx) mx = c;
        }
        
        if (s.charAt(0) == mn || s.charAt(n - 1) == mx) {
            return 1;
        }
        
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == mn || s.charAt(i) == mx) {
                return 2;
            }
        }
        
        return 3;
    }
    
    private boolean isSorted(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

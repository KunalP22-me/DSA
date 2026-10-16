//Problem 4070 Leetcode
class Solution {
    public int minRotations(String s) {
        int totalRotations = 0;
        int currentDigit = 0;

        for (int i = 0; i < s.length(); i++) {
            int nextDigit = s.charAt(i) - '0'; 
            
            int absoluteDiff = Math.abs(nextDigit - currentDigit);
            totalRotations += Math.min(absoluteDiff, 10 - absoluteDiff);

            currentDigit = nextDigit;
        }
        return totalRotations;
    }
}

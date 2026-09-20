//Problem 3498 Leetcode
class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int r_index = 26 - (c - 'a');
            sum += (r_index * (i + 1));

        }
        return sum;
    }
}

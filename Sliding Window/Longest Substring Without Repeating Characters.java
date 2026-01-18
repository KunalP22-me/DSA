// Problem 3 Leetcode

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int l = 0, res = 0;

        for (int h = 0; h < s.length(); h++) {

            while (set.contains(s.charAt(h))) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(h));
            res = Math.max(res, h - l + 1);
        }

        return res;
    }
}

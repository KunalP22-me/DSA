//Problem 567 Leetcode

import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // Frequency of s1
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int matched = 0; // number of chars whose freq becomes zero

        for (int right = 0; right < s2.length(); right++) {

            char rc = s2.charAt(right);

            // include right char
            if (map.containsKey(rc)) {
                map.put(rc, map.get(rc) - 1);
                if (map.get(rc) == 0) matched++;
            }

            // shrink window if size exceeds s1 length
            if (right - left + 1 > s1.length()) {

                char lc = s2.charAt(left);
                
                if (map.containsKey(lc)) {
                    if (map.get(lc) == 0) matched--;
                    map.put(lc, map.get(lc) + 1);
                }
                left++;
            }

            // all characters matched
            if (matched == map.size()) return true;
        }

        return false;
    }
}

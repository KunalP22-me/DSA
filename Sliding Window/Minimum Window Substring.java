//Problem 76 Leetcode

import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        int m=s.length();
        int n=t.length();


        if (m < n) return "";

        HashMap<Character, Integer> map=new HashMap<>();
        
        for(int i=0; i<n; i++){
            char c=t.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int l=0;
        int match=0;
        int start=0;
        int minLen = Integer.MAX_VALUE;

        for(int h=0; h<m; h++){
            char rc=s.charAt(h);
            if(map.containsKey(rc)){
                map.put(rc,map.get(rc)-1);
                if(map.get(rc)==0) match++;
            }
            while(match==map.size()){
                if (h - l + 1 < minLen) {
                    minLen = h - l + 1;
                    start = l;
                }
                char lc = s.charAt(l);
                if(map.containsKey(lc)){
                    if(map.get(lc)==0) match--;
                    map.put(lc,map.get(lc)+1);
                    }
            l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }




//different one

class Solution {
    public String minWindow(String s, String t) {

        // If s is smaller than t, no possible window
        if (s.length() < t.length()) return "";

        // Step 1: Frequency array for characters in t
        // Using array instead of HashMap for speed (ASCII characters)
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int left = 0, right = 0;
        int required = t.length();        // number of characters still needed
        int minLen = Integer.MAX_VALUE;   // length of smallest valid window
        int startIndex = 0;               // starting index of smallest window

        // Convert s to char array to avoid repeated charAt calls
        char[] sChars = s.toCharArray();

        // Sliding window
        while (right < sChars.length) {

            // -------- Expand window (right pointer) --------
            // If current character is needed, reduce required count
            if (map[sChars[right]] > 0) {
                required--;
            }

            // Decrease frequency (can go negative for extra chars)
            map[sChars[right]]--;
            right++;

            // -------- Contract window (left pointer) --------
            // Window is valid only when all characters are matched
            while (required == 0) {

                // ✅ EASY CHANGE:
                // Instead of directly writing (right - left),
                // we store it in a variable for clarity
                int windowLen = right - left;

                // Update minimum window if smaller
                if (windowLen < minLen) {
                    minLen = windowLen;
                    startIndex = left;
                }

                // Try removing left character
                if (map[sChars[left]] == 0) {
                    // Removing this breaks validity
                    required++;
                }

                map[sChars[left]]++; // restore frequency
                left++;              // shrink window
            }
        }

        // If no valid window found, return empty string
        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(startIndex, startIndex + minLen);
    }
}
}

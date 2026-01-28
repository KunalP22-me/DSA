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
}

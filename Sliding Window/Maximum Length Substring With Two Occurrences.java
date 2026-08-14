//Problem 3090 Leetcode
class Solution {
    public int maximumLengthSubstring(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        int i = 0; 
        int res = 0;
        
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            
            while (map.get(c) > 2) {
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);
                i++;
            }
            
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}

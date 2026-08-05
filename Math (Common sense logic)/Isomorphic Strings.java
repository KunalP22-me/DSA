//Problem 205 Leetcode
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap= new HashMap<>();
        HashMap<Character, Character> tmap= new HashMap<>();

        for(int i=0; i<s.length(); i++){

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(smap.containsKey(c1) && smap.get(c1)!=c2) return false;
            if(tmap.containsKey(c2) && tmap.get(c2)!=c1) return false;

            smap.put(c1,c2);
            tmap.put(c2,c1);
        }
        
        return true;
    }
}

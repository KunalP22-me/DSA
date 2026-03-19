//Problem 383 Leetcode

class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character, Integer> m_map = new HashMap<>();
        HashMap<Character, Integer> r_map = new HashMap<>();

        for (int i = 0; i < r.length(); i++) {
            r_map.put(r.charAt(i), r_map.getOrDefault(r.charAt(i), 0) + 1);
        }

        for (int i = 0; i < m.length(); i++) {
            m_map.put(m.charAt(i), m_map.getOrDefault(m.charAt(i), 0) + 1);
        }

        return check(r_map, m_map);
    }

    private Boolean check(HashMap<Character, Integer> r_map,HashMap<Character, Integer> m_map){
        
        for(char c: r_map.keySet()){
            int need = r_map.get(c);
            int available = m_map.getOrDefault(c, 0);

            if (available < need) return false;
        } 
        return true;
    }
}

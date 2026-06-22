//Problem 1189 Leetcode

class Solution {

    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
        }

        // Required characters for forming "balloon"
        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2; // 'l' appears twice
        int o = map.getOrDefault('o', 0) / 2; // 'o' appears twice
        int n = map.getOrDefault('n', 0);

        // Limiting character determines answer
        return Math.min(Math.min(l, o), Math.min(Math.min(a, n), b));
    }
}

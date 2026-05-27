//Leetcode Problem 3121

class Solution {
    public int numberOfSpecialChars(String word) {

        HashMap<Character, Integer> lower = new HashMap<>();
        HashMap<Character, Integer> upper = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                lower.put(ch, i);   // store last lowercase index

            } else {
                char small = Character.toLowerCase(ch);
                upper.putIfAbsent(small, i);   // store first uppercase index only
            }
        }

        int count = 0;

        for (char ch : lower.keySet()) {

            if (upper.containsKey(ch) && lower.get(ch) < upper.get(ch)) {
                count++;
            }
        }

        return count;
    }
}

//Leetcode 3120 Leetcode

class Solution {
    public int numberOfSpecialChars(String word) {

        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // check lowercase chars only
        for (int j = 0; j < word.length(); j++) {

            char c = word.charAt(j);

            // process only lowercase
            if (Character.isLowerCase(c)) {

                char upper = Character.toUpperCase(c);

                // uppercase exists
                if (map.getOrDefault(upper, 0) > 0) {

                    res++;

                    // avoid duplicate counting
                    map.put(upper, 0);
                }
            }
        }

        return res;
    }
}

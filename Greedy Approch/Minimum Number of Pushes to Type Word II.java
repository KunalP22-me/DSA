//Problem 3016 leetcode
class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        int pushes = 0;
        int count = 0;

        for (int i = 25; i >= 0; i--) {

            if (freq[i] == 0) break; // No more characters

            pushes += freq[i] * ((count / 8) + 1);
            count++;
        }

        return pushes;
    }
}

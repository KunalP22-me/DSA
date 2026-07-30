//Problem 3014 leetcode
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int pushes = 0;

        // Every 8 characters move to the next push count
        for (int i = 0; i < n; i++) {
            pushes += (i / 8) + 1;
        }

        return pushes;
    }
}

//Problem 904 Leetcode 

class Solution {
    public int totalFruit(int[] fruits) {

        int k = 2;
        int n = fruits.length;
        int low = 0, res = -1;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int high = 0; high < n; high++) {
            int c = fruits[high];
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // shrink window if more than k unique
            while (freq.size() > k) {
                int leftChar =fruits[low];
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) < 1)
                    freq.remove(leftChar);
                low++;
            }
                res = Math.max(res, high - low + 1);
        }
        return res;
    }
}

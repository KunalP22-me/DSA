//Problem 3483 Leetcode
class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        helper(digits, 0, 0, set);
        return set.size();
    }

    void helper(int[] digits, int level, int num, HashSet<Integer> set) {

        if (level == 3) {
            if (num % 2 == 0)
                set.add(num);
            return;
        }

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] == -1) continue; // Don't use the same index again
            if (level == 0 && digits[i] == 0) continue; // First digit cannot be 0

            int x = digits[i];
            digits[i] = -1;

            helper(digits, level + 1, num * 10 + x, set);
            digits[i] = x; //backtrack
        }
    }
}

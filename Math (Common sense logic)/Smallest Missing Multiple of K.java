//Problem 3718 Leetcode
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int c = k;
        while (set.contains(c)) {
            c = c + k;
        }
        return c;
    }
}

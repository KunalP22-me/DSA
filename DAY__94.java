//Problem 217 Leetcode

class Solution {
    public boolean containsDuplicate(int[] nums) {

        if (nums.length < 2) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.containsKey(i))
                return true;
            else
                map.put(i, 1);
        }

        return false;
    }
}

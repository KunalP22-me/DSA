//Problem 219 Leetcode

import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int l=0;
        HashSet<Integer> set = new HashSet<>();

        for (int h = 0; h < nums.length; h++) {

            if (set.contains(nums[h])) {
                return true;
            }

            set.add(nums[h]);

            // maintain window size k
            if (set.size() > k) {
                set.remove(nums[l]);
                l++;
            }
        }

        return false;
    }
}

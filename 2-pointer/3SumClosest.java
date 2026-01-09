// Problem 16 Leetcode

import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int maxdiff=Integer.MAX_VALUE;
        int ressum = 0; 

        for (int i = 0; i < n - 2; i++) {

            // skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];

                int diff = Math.abs(sum - target);
                    if(maxdiff>diff){
                        maxdiff=diff;
                        ressum = sum;
                    }

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }

                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return ressum;
    }
}

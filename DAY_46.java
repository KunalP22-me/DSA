//Problem 974 Leetcode

import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   // base case beacuse at first prefix sum is 0

        int sum = 0;
        int rem;
        int count = 0;

        for (int n=0; n<nums.length; n++) {
            sum += nums[n];
            rem= sum%k;

            if(rem<0) rem = rem+k; //for negative value 

            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}

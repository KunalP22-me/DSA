//Problem 523 Leetcode

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixSum = 0;

        for(int i=0; i<nums.length; i++)
        {
            prefixSum += nums[i];
            int rem = prefixSum % k;
            if(rem < 0) rem += k;

            if(map.containsKey(rem))
            {
                int prevIndex = map.get(rem);
                if(i - prevIndex >= 2) return true;
            }
            else
            {
                map.put(rem, i);
            }
        }
        return false;
    }
}

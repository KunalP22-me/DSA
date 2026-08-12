//Problem 2958 Leetcoode
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 1;
        int l = 0;

        for (int r = 0; r < n; r++) {
            int a = nums[r];
            map.put(a, map.getOrDefault(a, 0) + 1);

            while (map.get(a) > k) {
                int b = nums[l];
                map.put(b, map.get(b) - 1);
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}

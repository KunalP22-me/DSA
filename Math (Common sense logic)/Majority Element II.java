//Problem 229 Leetcode
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int v = n / 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> l = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) > v) {
                l.add(key);
            }
        }

        return l;
    }
}

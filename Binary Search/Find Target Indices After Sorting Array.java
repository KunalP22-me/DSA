//Problem 2089 Leetcode
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        List<Integer> res = new ArrayList<>();
        int mid = nums.length / 2;
        int f = nums[mid];

        if (f > target) {
            for (int i = 0; i <= mid; i++) {
                if (nums[i] == target)
                    res.add(i);
            }
        } else if (f < target) {
            for (int i = mid + 1; i < nums.length; i++) {
                if (nums[i] == target)
                    res.add(i);
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target)
                    res.add(i);
            }
        }
        return res;
    }
}

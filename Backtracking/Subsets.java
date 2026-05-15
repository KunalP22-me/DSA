//Problem 78 Leetcode
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ss = new ArrayList<>();

        fun(nums, 0, res, ss);
        return res;
    } 
    

    private void fun(int[] nums, int idx, List<List<Integer>> res, List<Integer> ss) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(ss));
            return;
        }

        ss.add(nums[idx]);
        fun(nums, idx + 1, res, ss);

        ss.remove(ss.size() - 1);
        fun(nums, idx + 1, res, ss);

    }
}

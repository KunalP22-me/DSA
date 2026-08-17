//Problem 2824 Leetcode
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);

        int n = nums.size();
        int c = 0;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            int sum = nums.get(i) + nums.get(j);

            if (sum < target) {
                c += j - i;
                i++;
            } else {
                j--;
            }
        }
        return c;
    }
}

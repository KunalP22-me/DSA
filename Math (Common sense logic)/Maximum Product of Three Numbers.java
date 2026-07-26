//Problem 628 Leetcode
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length-1;

        return Math.max(
            nums[0]*nums[1]*nums[n], // ✅ two smallest + largest buz (- * -) = +
            nums[n-2]*nums[n-1]*nums[n]
        );
    }
}

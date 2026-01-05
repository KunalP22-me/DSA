// Problem 80 leetcode
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        // int n = 2;

        for (int i=2; i<nums.length; i++){
            if(nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
                // n++;
            }
        }
        return k; //n also be returned
    }
}

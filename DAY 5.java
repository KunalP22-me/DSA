//problem 26 leetcode
class Solution {
    public int removeDuplicates(int[] nums) {
        int off = 0;
        int ns = 1;
        int cm = 1;
        int n = nums.length;
        while(cm<n){
            if(nums[cm]==nums[cm-1]){
                cm++;
                continue;
            }
            else if(nums[cm]!=nums[cm-1]){
                nums[off+1]=nums[cm];
                cm++;
                ns++;
                off++;
            }
        }
        return ns;
    }
}

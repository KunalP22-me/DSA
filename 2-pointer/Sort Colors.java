//Problem 75 Leetcode

class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;

        while(m<=h){
            if(nums[m]==0){
                swapElements(nums, l, m);
                l++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else if(nums[m]==2){
                swapElements(nums, m, h);
                h--;
            }
        }
    }

    private void swapElements(int[] array, int a, int b) {
        int temp = array[a]; 
        array[a] = array[b]; 
        array[b] = temp; 
    }
}

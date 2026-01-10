//Problem 75 Leetcode

class Solution {
    public void sortColors(int[] nums) {
        int z=0;
        int o=0;
        int t=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) z++;
            else if(nums[i]==1) o++;
            else t++;
        }

        int index =0;
        for(int j=0; j<z; j++){
            nums[index]=0;
            index++;
        }
        for(int k=0; k<o; k++){
            nums[index]=1;
            index++;
        }
        for(int p=0; p<t; p++){
            nums[index]=2;
            index++;
        }
    }
}

// Problem 15 Leetcode 3Sum

import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        int n= nums.length; 

        for(int i=0; i<n-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l=i+1;
            int r=n-1;
            int sum = -1 * nums[i];

            while(l<r){
                int s=nums[l]+nums[r];
                if(s==sum){
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    while(l<n && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(r>0 && nums[r]==nums[r+1]){
                        r--;
                    }
                }
                else if(s<sum){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return result;
    }
}

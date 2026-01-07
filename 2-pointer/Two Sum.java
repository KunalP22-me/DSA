// Problem 167 Leetcode
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int i=0;
        int j=n-1;
        
        while(i<j){
            int sum =numbers[i]+numbers[j];
            if(sum==target){
                return new int[]{i+1,j+1}; 
            }
            if(numbers[i]+numbers[j]<target){
                i++;
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
        }
        return new int[]{i+1,j+1};
    }
}
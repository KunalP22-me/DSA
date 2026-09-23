//Problem 1658 Leetcode
class Solution {
    public int minOperations(int[] nums, int x) {
	
    int sum = 0;
	for (int num: nums) sum += num;

	int maxLength = -1;
    int currSum = 0;
    int l=0;

	for (int r=0; r<nums.length; r++) {
		currSum += nums[r];

		while (l <= r && currSum > sum - x){
            currSum -= nums[l];
            l++;
        }

		if (currSum == sum - x) {
            maxLength = Math.max(maxLength, r-l+1);
        }
	}

    if(maxLength==-1) return -1;

	return nums.length - maxLength;
    }
}

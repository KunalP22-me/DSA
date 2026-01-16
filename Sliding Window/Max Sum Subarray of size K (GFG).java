//Problem GFG 

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        
        //one time use only
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;
        int i = 0;
        int j = k;

        for (int n = k; n < arr.length; n++) {
            sum = sum - arr[i++] + arr[j++];
            max = Math.max(max, sum);
        }
        return max;
    }
}

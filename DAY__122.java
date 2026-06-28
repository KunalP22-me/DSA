//Problem 1846 Leetcode

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        // Sort the array to process elements in increasing order
        Arrays.sort(arr);

        // Single element can always be made 1
        if (arr.length <= 1) {
            return 1;
        }

        // First element must be 1
        if (arr[0] != 1) {
            arr[0] = 1;
        }

        // Ensure adjacent difference is at most 1
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        // Last element becomes the maximum possible value
        return arr[arr.length - 1];
    }
}

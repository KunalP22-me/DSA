//Problem 3517 Leetcode
class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int pivot = n / 2;

        Arrays.sort(arr, 0, pivot);
        Arrays.sort(arr, n - pivot, n);

        // Reverse the second half
        int left = n - pivot;
        int right = n - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }
}

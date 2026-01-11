//Problem 345 Leetcode

class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;

        while (l < r) {
            while (l < r && !isVowel(arr[l])) l++;
            while (l < r && !isVowel(arr[r])) r--;

            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
        return new String(arr);
    }

    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }
}

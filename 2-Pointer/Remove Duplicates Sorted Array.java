import java.util.ArrayList;

class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        if (n == 0) return result;

        int left = 0;   // points to last unique element

        for (int right = 1; right < n; right++) {

            if (arr[right] != arr[left]) {
                left++;
                arr[left] = arr[right];
            }
        }

        // copy unique elements into ArrayList
        for (int i = 0; i <= left; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}

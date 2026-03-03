class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        // Initialize result with -1
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }

        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;

            while (!st.isEmpty() && nums[st.peek()] < nums[index]) {
                res[st.pop()] = nums[index];
            }

            if (i < n) {
                st.push(index);
            }
        }

        return res;
    }
}

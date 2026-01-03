class Solution {
    public int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and carry forward
            digits[i] = 0;
        }

        // If all digits were 9 (e.g., 999)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
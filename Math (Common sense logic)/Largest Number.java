//Problem 179 Leetcode

class Solution {
    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        // convert int to string
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i] + "";
        }

        // sort according to bigger combination
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // if biggest number is 0 then answer is 0
        if(arr[0].equals("0")){
            return "0";
        }

        String ans = "";

        // make final answer
        for(String s : arr){
            ans += s;
        }

        return ans;
    }
}

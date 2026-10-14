//Problem 3723 Leetcode
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum < 0 || sum > num * 9) return "";

        int nine = sum / 9;
        int rem = sum % 9;

        StringBuilder sb = new StringBuilder();

        while(num>0){
            if(nine>0){
                sb.append("9");
                nine--;
            }else if(rem!=0){
                sb.append(String.valueOf(rem));
                rem=0;
            }else{
                sb.append("0");
            }
            num--;
        }
        return sb.toString();
    }
}

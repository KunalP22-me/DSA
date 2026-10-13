//Problem 3727 Leetcode
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        if(n==1) return nums[0]*nums[0];

        int[] ss = new int[n];
        for(int i=0; i<n; i++){
            ss[i] = nums[i] * nums[i];
        }

        Arrays.sort(ss);

        int add = 0;
        int sub = 0;

        if(n%2==0){
            add=n/2;
            sub =n- add;
        }else{
            add=(n/2)+1;
            sub = n- add;
        }

        long res=0;
        for(int j=n-1; j>=0; j--){

            if(add>0){
                res += ss[j];
                add--;
            }else{
                res -= ss[j];
                sub--;
            }
        }
        return res;
    }
}

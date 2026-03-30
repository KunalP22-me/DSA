//Problem 852 Leetcode

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n =arr.length;
        int l=0;
        int h=n-1;
        int res=-1;

        while(l<=h){    
            int m = (l+h)/2;
            if(arr[m]<arr[m+1]) l=m+1;
            else{
                h=m-1;
                res=m;
            }
        }
        return res;
    }
}

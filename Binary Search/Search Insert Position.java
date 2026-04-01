//Problem 35 Leetcode

class Solution {
    public int searchInsert(int[] a, int x) {

        int n = a.length;
        int l=0;
        int h=n-1;
        
        while(l<=h){
            int m = (l+h)/2;

            if(a[m]==x) return m;
            
            if(a[m]<x){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return l;
    }
}

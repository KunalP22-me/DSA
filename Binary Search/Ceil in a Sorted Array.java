// Problem Ceil in a Sorted Array GFG
class Solution {
    public int findCeil(int[] a, int x) {
        int n = a.length;
        int l=0;
        int h=n-1;
        int res=-1;
        
        while(l<=h){
            int m = (l+h)/2;
            
            if(a[m]<x){
                l=m+1;
            }else{
                h=m-1;
                res=m;
            }
        }
        return res;
    }
}

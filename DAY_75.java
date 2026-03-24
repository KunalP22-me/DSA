//Problem 42 Leetcode
class Solution {
    public int trap(int[] h) {

        int n=h.length;
        int l=0, r=n-1;
        int maxl=0, maxr=0;
        int water =0;

        while(l<r){
            if(h[l] < h[r]){
                if(h[l]>=maxl){
                    maxl=h[l];
                }else{
                    water += maxl-h[l];
                }
                l++;
            }else{
                if(h[r]>=maxr){
                    maxr=h[r];
                }else{
                    water += maxr-h[r];
                }
                r--;
            }
        }
        return water;
    }
}

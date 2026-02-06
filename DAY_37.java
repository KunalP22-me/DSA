// Problem GFG ( Smallest sum contiguous subarray )

class Solution {
    static int smallestSumSubarray(int a[], int size) {
        
        int i= 0;
        int be= a[0];
        int ans= a[0];

        for(i=1; i<a.length; i++){
            int v1 = be+a[i];
            int v2 = a[i];

            be=Math.min(v1,v2);

            ans=Math.min(ans,be);
        }
        return ans;

    }
}

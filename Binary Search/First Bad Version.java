/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//Problem 278 Leetcode

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=0;
        int h=n;
        int res=0;
        while(l<=h){
            int m=(l+h)/2;
            boolean is = isBadVersion(m);
            if(is==false){
                l=m+1;
            }else{
                h=m-1;
                res=m;
            }
        }
        return res;
    }
}

//Problem 4 Leetcode

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        //merge sorted array
        int[] res = new int[m+n];
        int i=0;
        int j=0;
        int id=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                res[id++]=nums1[i++];
            }
            else if(nums1[i]>=nums2[j]){
                res[id++]=nums2[j++];
            }
        }
        while(j<n){
            res[id++]=nums2[j++];
        }
        while(i<m){
            res[id++]=nums1[i++];
        }

        int fi = res.length/2;

        if(res.length%2 == 0){
            return (res[fi - 1] + res[fi]) / 2.0;
        } else {
            return res[fi];
        }

    }
}

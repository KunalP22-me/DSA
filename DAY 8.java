//problem 28 Leetcode

class Solution {
    public int strStr(String haystack, String needle) {
        // User function Template for Java

        int t=haystack.length();
        int p=needle.length();
        
        for(int i =0; i<=t-p; i++){
            
            int j;
            for(j=0; j<p; j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            
            if(j==p){
                return i;
            }
        }
        return -1;
    }
}

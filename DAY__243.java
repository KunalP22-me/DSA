//Problem 2124 Leetcode
class Solution {
    public boolean checkString(String s) {
        int n = s.length();

        if(n==1) return true;

        boolean a = false;        
        boolean b = false;

        for(int i=0; i<n; i++){
            char c=s.charAt(i);

            if(b==true && c=='a') return false;

            if(c=='a' && a==false) a=true;
            if(c=='b' && b==false) b=true;

        }
        return true;        
    }
}

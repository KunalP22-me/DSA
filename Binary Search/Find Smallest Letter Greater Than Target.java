//Problem 744 Leetcode

class Solution {
    public char nextGreatestLetter(char[] letters, char t) {
        int l=0;
        int h=letters.length-1;
        char c=letters[0];

        while(l<=h){
            int m = (l+h)/2;

            if(letters[m]<=t) l =m+1;
            else{
                h=m-1;
                c=letters[m];
            }
        }
        return c;
    }
}

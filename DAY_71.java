//Problem 409 Leetcode

class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map =new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        int res=0;
        boolean isodd=false;
        for(char c: map.keySet()){
            int need = map.get(c);

            if (need % 2==0){
                res=res+need;
            }else{
                res= res+need-1;// case of value 3 not take 3 just take 2 value 
                isodd=true;
            }
        } 
        
        if(isodd) res++;
        return res;
    }
}

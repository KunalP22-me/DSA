//Problem 20 Leetcode

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            
            char cur = s.charAt(i);

            if(!st.isEmpty()){
                char prev = st.peek();
                if(isPair(prev, cur)){
                    st.pop();
                    continue;
                }
            }
            st.push(cur);
        }
        return st.isEmpty();
    }

    private boolean isPair(char last, char cur) { //IMPORTANT
        return (last == '(' && cur == ')') ||
               (last == '{' && cur == '}') ||
               (last == '[' && cur == ']');
    }    
}

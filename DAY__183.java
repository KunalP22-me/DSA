//Problem 131 Leetcode
class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> res= new ArrayList<>();
        fc(0, s, res, new ArrayList<>());
        return res;
    }
    
    private void fc(int ind, String s, List<List<String>> res, List<String> ds){
        if(ind==s.length()){
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i= ind; i<s.length(); i++){
            if(palin(s, ind, i)){
                ds.add(s.substring(ind, i+1));
                fc(i+1, s, res, ds);
                ds.remove(ds.size()-1);
            }
        }
    }

    private boolean palin(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}

//Problem 1431 Leetcode
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ec) {
        int n=candies.length;
        
        int m=candies[0];
        for(int i=1; i<n; i++){
            m=Math.max(m, candies[i]);
        }

        List<Boolean> res= new ArrayList<>();
        for(int j=0; j<n; j++){
            if(candies[j]+ec>=m){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}

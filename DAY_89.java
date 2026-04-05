//Problem 268 Leetcode
class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int c=0;
        while(c<=n){
            if(map.containsKey(c)) c++;
             else break;
        }
        return c;
    }
}

//Problem 986 Leetcode

class Solution {
    public int[][] intervalIntersection(int[][] l1, int[][] l2) {

        List<int[]> res = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<l1.length && j<l2.length){
            int l1_strt=l1[i][0];
            int l1_end=l1[i][1];

            int l2_strt=l2[j][0];
            int l2_end=l2[j][1];
            
            if (l1_strt <= l2_end && l2_strt <= l1_end) {
                    int x=Math.max(l1_strt,l2_strt);
                    int y=Math.min(l1_end,l2_end);
                    res.add(new int[]{x,y});
                }
            
            if(l1_end<=l2_end) i++;
            else j++;
        }
        return res.toArray(new int[res.size()][]);
    }
}

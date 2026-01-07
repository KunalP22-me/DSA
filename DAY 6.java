class Solution {
    public int[] mergesortedarray(int[] a, int[] b) {
        
        int n =a.size();
        int m =b.size();
        int id=0;
        int i =0;
        int j =0;

        int[] res = new int[n+m];

        while(i<n && j<m){
            if(a.get(i)<=b.get(j)){
                res[id]=a.get(i);
                id++;
                i++;
            }
            else {
                res[id]=b.get(j);
                id++;
                j++;
            }
        }
        while(j<m){
            res[id]=b.get(j);
            id++;
            j++;
        }
        while(i<n){
            res[id]=a.get(i);
            id++;
            i++;
        }
        return res;
    }
}

//Problem 60 Leetcode
class Solution {
    public String getPermutation(int n, int k) {
        int f = 1;
        List<Integer> ds = new ArrayList<>();
        
        for (int i = 1; i < n; i++) {
            f = f * i;
            ds.add(i);
        }

        ds.add(n);
        String ans = "";
        k = k - 1;

        while (true) {
            ans = ans + ds.get(k / f);
            ds.remove(k / f);

            if (ds.size() == 0)
                break;

            k = k % f;
            f = f / ds.size();
        }
        return ans;
    }
}

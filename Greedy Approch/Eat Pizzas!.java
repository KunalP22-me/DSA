//Problem 3457 leetcode
class Solution {
    public long maxWeight(int[] p) {
        Arrays.sort(p);

        int n = p.length - 1;
        int days = p.length / 4;

        int odd = (days + 1) / 2;
        int even = days / 2;

        long res = 0;
        int idx = n;

        while (odd > 0) {
            res += p[idx];
            idx--;
            odd--;
        }

        // Skip one pizza for each even day
        idx--;

        while (even > 0) {
            res += p[idx];
            idx -= 2;
            even--;
        }

        return res;
    }
}

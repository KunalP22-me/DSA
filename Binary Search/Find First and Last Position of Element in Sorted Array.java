//Problem 34 leetcode

class Solution {
    public int[] searchRange(int[] n, int t) {
        int[] res = {-1, -1};

        res[0] = firstOccurrence(n, t);
        res[1] = lastOccurrence(n, t);

        return res;
    }

    private int firstOccurrence(int[] n, int t) {
        int l = 0, h = n.length - 1;
        int ans = -1;

        while (l <= h) {
            int m = (l + h) / 2;

            if (n[m] < t) {
                l = m + 1;
            } else if (n[m] > t) {
                h = m - 1;
            } else { //equal
                ans = m;
                h = m - 1; //go left
            }
        }
        return ans;
    }

    private int lastOccurrence(int[] n, int t) {
        int l = 0, h = n.length - 1;
        int ans = -1;

        while (l <= h) {
            int m = (l + h) / 2;

            if (n[m] < t) {
                l = m + 1;
            } else if (n[m] > t) {
                h = m - 1;
            } else { //equal
                ans = m;
                l = m + 1; //go right
            }
        }
        return ans;
    }
}

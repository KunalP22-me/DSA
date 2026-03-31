//Problem 875 Leetcode

class Solution {
    public int minEatingSpeed(int[] p, int h) {
        
        //find greatest in array
        int largest = p[0];
        for (int i = 1; i < p.length; i++) {
            if (p[i] > largest) {
                largest = p[i];
            }
        }


        //check which mid is proper
        int low = 1;
        int high = largest;
        int res = -1;

        while (low <= high) {
            int m = (low + high) / 2;

            long temp = find(p, m);

            if (temp > h) {
                low = m + 1;
            } else {
                res = m;
                high = m - 1;
            }
        }
        return res;
    }

    //find hour taken in per mid
    private long find(int[] a, int s) {
        long h = 0;

        for (int i = 0; i < a.length; i++) {
            h += a[i] / s;
            if (a[i] % s != 0) {//if value taken extra space
                h++;
            }
        }
        return h;
    }
}

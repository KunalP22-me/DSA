//Problem 2418 Leetcode
class Solution {
    public String[] sortPeople(String[] names, int[] h) {
        int n = names.length;
        String[] res = new String[n];
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(h[i], names[i]);
        }

        Arrays.sort(h);
        int c = 0;

        for (int j = n - 1; j >= 0; j--) {
            res[c] = map.get(h[j]);
            c++;
        }
        return res;
    }
}

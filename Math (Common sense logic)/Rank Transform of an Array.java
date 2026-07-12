//Problem 1331 Leetcode
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a1 = arr.clone();
        Arrays.sort(a1);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank =1;

        for (int n :a1) {
            if(!map.containsKey(n)){
                map.put(n, rank);
                rank++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}

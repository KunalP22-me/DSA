//Problme 3731 Leetcode
class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
            map.put(arr[i], 1);
        }
        
        List<Integer> l = new ArrayList<>();
        for(int i=min; i<max; i++){
            if(!map.containsKey(i)){
                l.add(i);
            }
        }

        return l;
    }
}

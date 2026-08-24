//Problem 46 Leetcode
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        int[] q = new int[nums.length];
        
        List<List<Integer>> res = new ArrayList<>();
        fc(nums, res, new ArrayList<>(), q);

        return res;

    }

    private void fc(int[] arr, List<List<Integer>> res, List<Integer> ds, int[] f) {

        if (ds.size() == arr.length) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (f[i] == 0) {
                f[i]++;
                ds.add(arr[i]);
                fc(arr, res, ds, f);
                ds.remove(ds.size() - 1);
                f[i]--;
            }
        }
    }
}

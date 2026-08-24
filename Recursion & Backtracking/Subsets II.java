//Problem 90 Leetcode
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(nums);

        fc(0, nums, res, new ArrayList<>());

        return res;

    }

    private void fc(int index, int[] arr, List<List<Integer>> res, List<Integer> ds) {

        res.add(new ArrayList<>(ds));

        for (int i = index; i < arr.length; i++) {
            
            if (i > index && arr[i] == arr[i - 1])continue;
            
            ds.add(arr[i]);
            fc(i + 1, arr, res, ds);
            ds.remove(ds.size() - 1);
        }
    }
}

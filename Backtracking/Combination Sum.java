//Problem 39 Leetcode

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        int n = candidates.length;
        int idx = 0;
        int sum = 0;
        List<Integer> diary = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        back(candidates, n, idx, diary, sum, res, target);

        return res;
    }

    private void back(int[] a, int n, int idx, List<Integer> diary, int sum, List<List<Integer>> res, int target) {

        if (idx == n) { // reached end
            if (sum == target) { // valid combination
                res.add(new ArrayList<>(diary));
            }
            return;
        }

        back(a, n, idx + 1, diary, sum, res, target); // skip current

        if (a[idx] + sum <= target) { // take only if valid

            diary.add(a[idx]); // choose element
            sum += a[idx]; // update sum

            back(a, n, idx, diary, sum, res, target); // reuse same element

            diary.remove(diary.size() - 1); // backtrack
            sum -= a[idx]; // restore sum
        }
        return;
    }
}

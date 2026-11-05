//Problem 145 Leetcode
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        post(root, res);
        return res;
    }

    private void post(TreeNode root, List<Integer> result){
        if(root==null) return;

        post(root.left, result);
        post(root.right, result);
        result.add(root.val);
    }
}

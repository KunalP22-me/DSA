//Problem 111 Leetcode
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;

        //edge case
        if(root.left==null) return 1+minDepth(root.right);
        if(root.right==null) return 1+minDepth(root.left);

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        return 1 + Math.min(left, right);      
    }
}

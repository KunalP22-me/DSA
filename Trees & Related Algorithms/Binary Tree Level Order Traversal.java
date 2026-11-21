//Problem 102 Leetcode
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return ans;
        queue.offer(root);

        while(!queue.isEmpty()) {

            int size = queue.size(); 
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++){

                TreeNode curr = queue.poll();
                level.add(curr.val);

                if(curr.left != null){
                    queue.offer(curr.left);
                }

                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }

            ans.add(level);
        }

        return ans;
    }
}

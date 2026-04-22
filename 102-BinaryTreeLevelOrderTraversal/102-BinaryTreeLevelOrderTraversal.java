// Last updated: 23/04/2026, 00:06:35
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null){
            return res;
        }
        q.add(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> subLevel = new ArrayList<>();
            for(int i = 0; i< level; i++){
                if(q.peek().left != null){
                  q.add(q.peek().left); 
                }
                if(q.peek().right != null){
                  q.add(q.peek().right); 
                }
                subLevel.add(q.remove().val);
            }
            res.add(subLevel);        
        }
        return res;
    }
}
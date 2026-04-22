// Last updated: 23/04/2026, 00:04:19
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a = recursive(root1, new LinkedList<>());
        List<Integer> b = recursive(root2, new LinkedList<>());

        return a.equals(b);
        
    }

    public List<Integer> recursive(TreeNode node, List<Integer> list){
        if(node == null){
            return list;
        }
        if(node.left == null && node.right == null){
            list.add(node.val);
            return list;
        }
        recursive(node.left, list);
        recursive(node.right, list);

        return list;
    }
}
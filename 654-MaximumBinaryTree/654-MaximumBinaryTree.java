// Last updated: 23/04/2026, 00:04:43
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 1) return new TreeNode(nums [0]);

        Deque<TreeNode> s = new ArrayDeque<>();
        TreeNode root = new TreeNode(nums[0]);
        s.push(root);

        for(int i = 1;i < nums.length; i++){
            if(nums[i] < s.peek().val) s.push(new TreeNode(nums[i]));
            else{
                TreeNode child = s.pop();
                TreeNode parent = null;
                while(s.size()!= 0 && nums[i] > s.peek().val){
                    parent = s.pop();
                    parent.right = child;
                    child = parent;
                }
                TreeNode temp = new TreeNode(nums[i]);
                if(nums[i] > root.val) root = temp;
                if(parent != null) temp.left = parent;
                else temp.left = child;
                s.push(temp);
            }
        }
        if(s.size() != 0){
            TreeNode child = s.pop();
            while(s.size() != 0){
                TreeNode temp = s.pop();
                temp.right = child;
                child = temp;
            }
        }
        return root;
    }
}
// Last updated: 23/04/2026, 00:06:32
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;

        return getBST(nums, 0, nums.length - 1);
    }
    public static TreeNode getBST(int arr[], int start,  int end){
        if(start > end) return null;

        int mid = (start + end)/2;
        TreeNode bst = new TreeNode(arr[mid]);
        bst.left = getBST(arr, start, mid -1);
        bst.right = getBST(arr, mid+1, end);

        return bst;
    }
}
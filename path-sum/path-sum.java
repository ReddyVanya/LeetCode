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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
      //  if(targetSum<root.val) return false;
        if(root.left==null && root.right==null){
            if(root.val==targetSum) return true;
            else return false;
        }
        if(root.left==null){
            return hasPathSum(root.right,targetSum-root.val);
        }
        if(root.right==null){
            return hasPathSum(root.left,targetSum-root.val);
        }
        else{
            return(hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val));
        }
        
    }
}
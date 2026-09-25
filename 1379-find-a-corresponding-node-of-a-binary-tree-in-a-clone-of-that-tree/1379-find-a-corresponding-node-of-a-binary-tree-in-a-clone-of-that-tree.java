/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return find(cloned,target.val);
    }
    public TreeNode find(TreeNode root, int target){
        if(root == null || root.val == target)
            return root;
        
        TreeNode leftresult = find(root.left,target);
        if(leftresult != null && leftresult.val == target)
            return leftresult;
        return find(root.right,target);
    }
}
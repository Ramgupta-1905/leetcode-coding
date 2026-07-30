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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map = new HashMap<>();
        // inorder mapping\
        for(int i =0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(0,inorder.length-1,0,preorder.length-1,map,preorder);
    }
    public TreeNode build(int si , int ei, int sp, int ep , Map<Integer,Integer> map ,int[] pre ){
        if(si >ei || sp >ep)
            return null;
        TreeNode root = new TreeNode(pre[sp]);
        int indx = map.get(pre[sp]);
        root.left = build(si,indx-1,sp+1,sp+(indx-si),map,pre);
        root.right = build(indx+1,ei,sp+(indx-si)+1,ep,map,pre);

        return root;
    }
}
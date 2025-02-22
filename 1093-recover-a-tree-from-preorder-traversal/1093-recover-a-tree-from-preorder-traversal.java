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
    int i = 0;
    public TreeNode recoverFromPreorder(String traversal) {
        i = 0;
        return solve(traversal,0);
    }
    public TreeNode solve(String traversal,int depth){
        if(i>=traversal.length()) return null;
        
        int das = 0;
        while((i+das)<traversal.length() && traversal.charAt(i+das) == '-'){
            das++;
        }

        if(das != depth) return null;

        i += das;

        int val =0;
        while(i < traversal.length() && Character.isDigit(traversal.charAt(i))){
            val = val * 10 + (traversal.charAt(i++)-'0');
        }
        TreeNode node = new TreeNode(val);

        node.left = solve(traversal,depth+1);
        node.right = solve(traversal,depth+1);

        return node;
    }
}
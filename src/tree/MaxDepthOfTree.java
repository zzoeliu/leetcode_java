package tree;

/**
 * Created by ZoeLiu on 7/2/15.
 * problem description:
 * Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * Diffuculty Level: 1
 * Frequency Level : 1
 * Algorithms : tree
 *
 * Standard DFS algo:
 * first judge root==null
 * then if left/right is not null, consider left/right
 * at last combine left and right
 */
public class MaxDepthOfTree {
    public int maxDepth(TreeNode root) {

        if(root==null) return 0;
        int l=0,r=0;

        if(root.left!=null)
            l=maxDepth(root.left);
        if(root.right!=null)
            r=maxDepth(root.right);
        if(l>r) return l+1;
        else return r+1;
    }
}

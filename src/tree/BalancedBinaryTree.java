package tree;

/**
 * Created by ZoeLiu on 7/3/15.
 * Given a binary tree, determine if it is height-balanced.

 For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees
 of every node never differ by more than 1.
 * Diffuculty Level: 1
 * Frequency Level : 2
 *
 * Design
 */
public class BalancedBinaryTree {public boolean isBalanced(TreeNode root)
{
    int left=0,right=0;


    if(root==null) return true;

    if(root.left!=null)
    {
        left=getDepth(root.left);

    }
    if(root.right!=null) right=getDepth(root.right);

    if(Math.abs(left-right)<=1)
        return isBalanced(root.left)&&isBalanced(root.right);
    else return false;

}

    int getDepth(TreeNode root)
    {
        if(root==null) return 0;
        int left=0,right =0;

        if(root.left!=null) left=getDepth(root.left);
        if(root.right!=null) right=getDepth(root.right);

        return Math.max(left,right)+1;
    }
}

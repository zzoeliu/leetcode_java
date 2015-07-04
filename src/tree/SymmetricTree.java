package tree;

/**
 * Created by ZoeLiu on 7/3/15.
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 For example, this binary tree is symmetric:

 1
 / \
 2   2
 / \ / \
 3  4 4  3
 But the following is not:
 1
 / \
 2   2
 \   \
 3    3
 Design: We need to compare the symmetric of two subtrees, so an extra function named isSubSymmetric is needed.
 *  Diffuculty Level: 1
 * Frequency Level : 2
 */

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root)
    {
        if(root==null)
            return true;
        return isSubSymmetric(root.left,root.right);
    }

    public boolean isSubSymmetric(TreeNode left,TreeNode right)
    {
        if(left==null && right == null) return true;
        else if (left!=null && right != null)
        {
            if(left.val==right.val)
            {
                return isSubSymmetric(left.left,right.right)&&isSubSymmetric(left.right,right.left);
            }else return false;
        }
        return false;
    }
}

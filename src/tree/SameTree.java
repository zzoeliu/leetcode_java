package tree;

/**
 * Created by ZoeLiu on 7/2/15.
 * problem Description:
 * Given two binary trees, write a function to check if they are equal or not.

 Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * Diffuculty Level: 1
 * Frequency Level : 1
 * Algorithms : tree
Design:
 consider 4 senarioes:
 1.both null return true
 2.both non-null we need to compare val as well as the left and right subtree
 3.only one null, return false.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if(p==null && q==null)
        {
            return true;

        }else if(p!=null && q!=null)
        {
            if(p.val==q.val)
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }else return false;

        return false;
   }

}

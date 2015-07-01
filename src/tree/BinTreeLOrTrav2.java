package tree;

/**
 * Created by ZoeLiu on 7/1/15.
 * Leetcode 107
 *
 * Problem Description:
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

 For example:
 Given binary tree {3,9,20,#,#,15,7},
 3
 / \
 9  20
 /  \
 15   7
 return its bottom-up level order traversal as:
 [
 [15,7],
 [9,20],
 [3]
 ]
 * Diffuculty Level: 3
 * Frequency Level : 1
 * Algorithms : tree
 *
 * Notes: same as Binary Tree Level Order Traversal I,use Collections.reverse() method to get the bottom-up arraylist
 */
import java.util.ArrayList;
import java.util.Collections;

public class BinTreeLOrTrav2 {

    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root)
    {
        ArrayList<ArrayList<Integer>> travList = new ArrayList<ArrayList<Integer>>();
        //int i=0;
        if(root==null) return travList;
        //used for record nodes in the current layer
        ArrayList<TreeNode> treeList=new ArrayList<TreeNode>();
        treeList.add(root);
        while(!treeList.isEmpty()) {
            ArrayList<TreeNode> tempList = new ArrayList<TreeNode>();
            ArrayList<Integer> curLevelValue = new ArrayList<Integer>();
            while (!treeList.isEmpty()) {
                TreeNode curNode = treeList.remove(0);
                curLevelValue.add(curNode.val);
                if (curNode.left != null) {
                    tempList.add(curNode.left);
                }
                if (curNode.right != null) {
                    tempList.add(curNode.right);
                }
            }
            travList.add(curLevelValue);
            treeList = tempList;

        }
        Collections.reverse(travList);
        return travList;
    }
}

package tree;

/**
 * Created by ZoeLiu on 7/1/15.
 *LeetCode 102
 * Problem Description:
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its level order traversal as:
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 * Diffuculty Level: 3
 * Frequency Level : 4
 * Algorithms : tree
 * Use two queues to record current level as well as the next level.
 * travList is used to record result.
 * treeList is used to record current level nodes
 * tempList is used for next level nodes
 * curLevelValue is used for current level values
 *
 *
 * Notes:List is abstract interface . It has be implemented as ArrayList,stack,LinkedList,vector,stack
 * Debugging issue:
 *
 * ArrayList<List<Integer>> travList = new ArrayList<List<Integer>>();
 * ArrayList<ArrayList<Integer>> is not a subset of List<List<Integer>>,instead ArrayList<List<Integer>> is.
 */
import java.util.ArrayList;

public class BinTreeLOrTrav {

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {

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
        return travList;
    }
}

package tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Definition for a binary tree node.
 * Used by all tree related problems
 */


public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; left = null ; right = null;}
         TreeNode newtree(int[] array){
             TreeNode root = new TreeNode(array[0]);
             Deque<TreeNode> queue = new LinkedList<TreeNode>();
             queue.offer(root);
             for(int i = 1; i < array.length/2; i++){
                 TreeNode temp = queue.poll();
                 if((2*i + 1) < array.length && array[2*i + 1] != '#'){
                     temp.left = new TreeNode(array[2*i + 1]);
                 }
                 if((2*i + 2) < array.length && array[2*i + 2] != '#') {
                     temp.right = new TreeNode(array[2 * i + 2]);
                 }
             }
             return root;
         }
     }

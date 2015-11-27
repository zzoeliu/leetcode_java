package tree;

import java.util.Scanner;

/**
 * Created by ZoeLiu on 11/26/15.
 */
public class segmentTree {

    private TreeNode root = null;
    private static class TreeNode{
        int start;
        int end;
        int value;
        TreeNode left,right;
        public TreeNode(int begin, int end){
            this.start = begin;
            this.end = end;
            this.value = 0;
            left = null;
            right = null;
        }
    }
    public segmentTree(int[] nums){
        root = buildTree(nums,0, nums.length - 1);
    }
    public TreeNode buildTree(int[] num, int start, int end){


        TreeNode node = new TreeNode(start,end);
        if(start == end){
            node.value = num[start];
            return node;
        }
        if(start > end){
            return null;
        }
        int mid = start + (end - start)/2;
        node.left = buildTree(num, start, mid);
        node.right = buildTree(num, mid + 1, end);
        node.value = node.left.value + node.right.value;
        return node;
    }
    public void update(int i, int val) {

        //int diff = val;
        updateNode(root,i, val);
    }
    public void updateNode(TreeNode node, int i , int val){
        if(node == null){
            return ;
        }
        if(node.start == node.end){
            node.value = val;//this node is leaf node ,so just update the node value to val, then
        }else{
            int mid = node.start + (node.end - node.start)/2;
            if(i <= mid){
                updateNode(node.left, i, val);
            }else{
                updateNode(node.right, i, val);
            }
            node.value = node.left.value + node.right.value; //this step is really import, cause we use bottom to up method, we need to update the parent sum according to the passing by left and right node
        }
    }
    public int sumRange(int i, int j) {
        //assert(i <= j);
        return sumNodeRange(root, i ,j);
    }
    public int sumNodeRange(TreeNode node, int start ,int end){
        if(node.start == start && end == node.end){
            return node.value;
        }

        int mid = node.start + (node.end - node.start)/2;
        if(start >= mid + 1){
            return sumNodeRange(root.right, start ,end);
        }else if(end <= mid){
            return sumNodeRange(root.left, start ,end);
        }else{
            return sumNodeRange(root.left, start ,mid) + sumNodeRange(root.right, mid + 1 ,end);
        }
    }
}

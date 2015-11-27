package tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ZoeLiu on 10/23/15.
 */
public class constructLevel {

    /**
     * public class TreeNode {
     *   public int key;
     *   public TreeNode left;
     *   public TreeNode right;
     *   public TreeNode(int key) {
     *     this.key = key;
     *   }
     * }
     */
    public TreeNode reconstruct(int[] in, int[] level) {
            // Write your solution here.
            if (in == null || level == null || in.length == 0 || level.length == 0){
                return null;
            }
            Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
            for (int i = 0; i < in.length; i++){
                hashmap.put(in[i], i);
            }
            return reconstructLevel(in, level, 0, in.length - 1, hashmap);
        }
        private TreeNode reconstructLevel(int[] in, int[] level, int istart, int iend, Map<Integer, Integer> hashmap){
            if(in == null || level == null ||in.length == 0 || level.length == 0|| istart > iend || istart < 0 || istart >= in.length || iend < 0 || iend >= in.length){
                return null;
            }
            int value = level[0];
            int index = hashmap.get(value);
            int leftLen = index - istart;
            int rightLen = iend - index;
            int[] levelLeft = new int[leftLen];
            int[] levelRight = new int[rightLen];
            int left = 0, right = 0;
            Set<Integer> hashset = new HashSet<Integer>();
            for (int i = 0 ; i < leftLen; i++){
                hashset.add(in[istart + i]);
            }
            for(int i = 1; i < level.length; i++){
                if (!hashset.isEmpty() && hashset.contains(level[i])){
                    levelLeft[left++] = level[i];
                }else{
                    levelRight[right++] = level[i];
                }
            }
            TreeNode root = new TreeNode(value);
            root.left = reconstructLevel(in, levelLeft, istart, index - 1, hashmap);
            root.right = reconstructLevel(in, levelRight, index, iend, hashmap);
            return root;
        }


}

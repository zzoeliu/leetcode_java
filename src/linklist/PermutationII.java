package linklist;

import sun.org.mozilla.javascript.internal.ast.ArrayLiteral;

import java.util.ArrayList;

/**
 * Created by ZoeLiu on 7/7/15.Similar with Permutation, just use hashset for uniqueness.
 */
public class PermutationII {
    public ArrayList<List<Integer>> permuteUnique(int[] nums) {

        ArrayList<List<Integer>> result=new ArrayList<List<Integer>>();
        ArrayList<Integer> temp=new ArrayList<Integer>();
        result.add(temp);

        for(int i=0;i<nums.length;i++)
        {
            Set<ArrayList<Integer>> current=new HashSet<ArrayList<Integer>>();

            for(List<Integer> l:result)
            {
                for(int j=0;j<l.size()+1;j++)
                {

                    l.add(j,nums[i]);
                    ArrayList<Integer> newTemp=new ArrayList<Integer>(l);
                    current.add(newTemp);
                    l.remove(j);
                }
            }
            result=new ArrayList<List<Integer>>(current);
        }

        return result;
    }
}

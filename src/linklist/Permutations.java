package linklist;

import java.util.ArrayList;

/**
 * Created by ZoeLiu on 7/7/15.
 */
/*public class Permutations {
    public ArrayList<ArrayList<Integer>> permute(int[] nums)
    {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp= new ArrayList<Integer>();
        result.add(temp);
        for(int i=0;i<nums.length;i++)
        {
            ArrayList<ArrayList<Integer>> current=new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> l:result)
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


}*/

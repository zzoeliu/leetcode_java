/*package math;

/**
 * Created by ZoeLiu on 7/31/15.
 */
/*import java.util.ArrayList;

public class TwoSumAllPair {
    public List<List<Integer>> allPairs(int[] array, int target) {
        // write your solution here
        ArrayList<List<Integer>> results = new ArrayList<List<Integer>>();
        if(array == null || array.length < 2) return results;
        Arrays.sort(array);

        int i = 0, j = array.length - 1;
        while(i < j)
        {
            if(array[i] == array[i+1])
            {
                if(2 * array[i] == target)
                {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(array[i]);
                    temp.add(array[i]);
                    results.add(temp);
                }
            }
            if(array[j] == array[j-1])
            {
                if(2 * array[j] == target)
                {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(array[j]);
                    temp.add(array[j]);
                    results.add(temp);
                }
            }
            while(array[i] == array[i+1])
            {
                i++;
            }
            while(array[j] == array[j-1])
            {
                j--;
            }
            if(i < j)
            {
                int sum = array[i] + array[j];
                if(sum == target)
                {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(array[i]);
                    temp.add(array[j]);
                    results.add(temp);
                }else if(sum > target)
                {
                    j--;
                }else
                {
                    i++;
                }
            }
        }
        return null;
    }
}*/

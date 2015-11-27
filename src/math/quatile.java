package math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZoeLiu on 11/7/15.
 */
public class quatile {
    public List<Integer> getQuatile(int[] array, int q){
        List<Integer> result = new ArrayList<Integer>();
        int len = array.length;
        for(int i = 1 ; i < q ; i++){
            int index = (int)Math.ceil((double)(len - 1)*i/q);
            result.add(array[index]);
        }

        return result;
    }
}

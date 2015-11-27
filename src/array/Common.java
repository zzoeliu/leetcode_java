package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ZoeLiu on 11/17/15.
 */
public class Common {
    public List<Integer> common(List<Integer> a, List<Integer> b) {
        // write your solution here
        if(a == null || b == null || a.size() == 0 || b.size() == 0){
            return null;
        }
        Collections.sort(a);
        Collections.sort(b);
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<Integer>();
        while(i < a.size() && j < b.size()){
            if(a.get(i).equals(b.get(j))){
                result.add(a.get(i));
                i++;
                j++;
            }else if(a.get(i) < b.get(j)){
                i++;
            }else{
                j++;
            }
        }
        return result;
    }
}

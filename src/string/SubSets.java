package string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZoeLiu on 9/15/15.
 */
public class SubSets {
        public List<String> subSets(String set) {
            // write your solution here
            List<String> result = new ArrayList<String>();
            //deal with corner cases
            if (set == null)
                return result;
            if (set.length() == 0){
                result.add("");
                return result;
            }
            //add null to result
//            result.add("");
            StringBuilder str = new StringBuilder();
            dfsHelper(set, 0, result, str);
            return result;
        }
    private void dfsHelper(String set, int index, List<String> result,StringBuilder str){
            /*result.add(str.toString());
            for (int i = index ; i < set.length(); i++){
                str.append(set.charAt(i));
                dfsHelper(set, i + 1, result, str);
                str.deleteCharAt(str.length() - 1);
            }*/
        if(index == set.length()){
            result.add(str.toString());
            return;
        }
        dfsHelper(set, index + 1,result, str);
        dfsHelper(set, index + 1,result, str.append(set.charAt(index)));
        str.deleteCharAt(str.length() - 1);
        }
    }

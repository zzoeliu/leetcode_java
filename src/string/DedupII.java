package string;

/**
 * Created by ZoeLiu on 11/17/15.
 */
public class DedupII {
    public String deDup(String input) {
        // write your solution here
        if(input == null || input.length() <= 2){
            return input;
        }
        char[] array = input.toCharArray();
        int start = 1, index = 2;
        while(index < array.length){
            if(array[index] == array[start - 1]){
                index++;
            }else{
                array[++start] = array[index++];
            }
        }
        String result = new String(array);

        return result.substring(0,start + 1);
    }
}

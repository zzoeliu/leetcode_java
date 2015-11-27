package string;

/**
 * Created by ZoeLiu on 9/16/15.
 */
public class removeDuplicate {
    public String remove(String input, String t) {
        // Write your solution here.
        if (input == null || t == null)
            return input;
        char[] array = input.toCharArray();
        int i = 0;
        for (int j = 0; j < array.length; j++){
            if (!t.contains(Character.toString(array[j]))){
                array[i++] = array[j];
            }
        }
        input = new String(array,0,i);
        return input;
    }
}

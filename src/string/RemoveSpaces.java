package string;

/**
 * Created by ZoeLiu on 9/15/15.
 */
public class RemoveSpaces {
    public String removeSpaces(String input) {
        // Write your solution here.
        assert(input != null);

        input = input.trim();
        char[] array = input.toCharArray();
        int i = 0;
        int j = 0;
        while(i < array.length){
            if(array[i] != ' '){
                array[j++] = array[i++];
            }else{
                array[j++] = ' ';
                while(array[i] == ' ')
                    i++;
            }
        }
        return new String(array).substring(0,j);
    }
}

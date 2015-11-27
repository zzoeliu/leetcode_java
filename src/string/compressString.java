package string;

/**
 * Created by ZoeLiu on 10/9/15.
 */
public class compressString {
    public String compressStr(String str){
        if(str == null || str.length() == 0){
            return str;
        }
        int i = 0;
        int boundary = 0;
        char[] array = str.toCharArray();
        while(i < array.length){
            int j = i + 1;
            int count = 1;
            while(j < array.length && array[j++] == array[i++]){
                count++;
            }
            array[boundary] = array[i];
            if(count > 1){
                array[++boundary] = (char)(count + '0');
            }
            boundary++;
            i = j;
        }
        return new String(array,0,boundary);
    }
}

package string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZoeLiu on 9/22/15.
 */
public class DecompressString {
    public String decompress(String input){
        if (input == null || input.length() == 0){
            return input;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length() - 1; i+=2){
            char tempChar = input.charAt(i);
            int occ = input.charAt(i+1) - '0';
            while(occ > 0){
                result.append(tempChar);
                occ--;
            }
        }
        return result.toString();
    }
}

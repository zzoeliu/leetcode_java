package string;

/**
 * Created by ZoeLiu on 9/23/15.
 */
public class match {
    public boolean match(String input, String pattern) {
        // Write your solution here.
        //Use recursive
        if (input.length() == 0 && pattern.length() == 0)
            return true;
        int i = 0, j = 0;
        char temp = pattern.charAt(j);
        if (!Character.isDigit(temp)){
            if (input.charAt(i) != temp)
                return false;
            else return match(input.substring(i + 1),pattern.substring(j + 1));
        }else {
            int num = 0;
            while(j < pattern.length() && Character.isDigit(temp)){
                num = num * 10 + temp - '0';
                if((j+1) < pattern.length()){
                    temp = pattern.charAt(j+1);
                }
                j++;
            }
            if(j == pattern.length() && (i + num) == input.length()){
                return true;
            }
            if(j < pattern.length() && (i + num) < input.length()) {

                if (i + num > input.length()) {
                    return false;
                } else
                    return match(input.substring(i + num), pattern.substring(j));
            }else{
                return false;
            }
        }
        //return true;
    }
}

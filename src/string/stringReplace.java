package string;

/**
 * Created by ZoeLiu on 9/22/15.
 */
public class stringReplace {
    public String replace(String input, String s, String t) {
        if (input == null || s == null || t == null || input.length() == 0 || s.length() == 0) {
            return input;
        }
        int sLen = s.length();
        int tLen = t.length();
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < input.length()) {
            while (i <= input.length() - sLen) {
                String temp = input.substring(i, i + sLen);
                if (temp.equals(s)) {
                    result.append(t.toCharArray());
                    i += sLen;
                } else {
                    result.append(input.charAt(i));
                    i++;
                }
            }
            while(i < input.length()){
                result.append(input.charAt(i));
                i++;
            }
        }
        return result.toString();

        }
    }

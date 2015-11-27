package string;

/**
 * Created by ZoeLiu on 9/16/15.
 */
public class strstr {
    public int strstr(String large, String small) {
        // write your solution here
        assert(large != null && small != null);
        if (small.length() == 0)
            return 0;
        int len1 = large.length();
        int len2 = small.length();
        if (len1 < len2)
            return -1;
        int i = 0, j = 0;
        //i stands for the index in large,j stands for index in small
        while(i < len1 && j < len2){
        //while(i - j < len1 - len2){
            if (large.charAt(i) == small.charAt(j)){
                i++;
                j++;
            }else{
                i = i - j + 1;
                j = 0;
            }
            if(j == len2)
                return i - j;
        }
        return -1;
    }
}

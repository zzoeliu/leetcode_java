package math;

/**
 * Created by ZoeLiu on 10/5/15.
 */
public class Excel {
    public int titleToNumber(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += sum*26 + (s.charAt(i) - 'A' + 1);
        }
        return sum;
    }
}

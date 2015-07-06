package string;

/**
 * Created by ZoeLiu on 7/5/15.
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        if(s==null || s.length()==0) return 0;
        String[] sentence=s.split(" ");
        return sentence[sentence.length-1].length();

    }
}

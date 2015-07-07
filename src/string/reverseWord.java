package string;

/**
 * Created by ZoeLiu on 7/7/15.
 *
 * Note: String.equals is not the same as ==
 */
public class reverseWord {
    public String reverseWords(String s) {

        if(s==null || s.length()==0)
        return "";
        String[] temp=s.split(" ");
        StringBuilder result=new StringBuilder();

        for(int j=temp.length-1;j>=0;j--)
        {
            if(!temp[j].equals(""))
                result.append(temp[j]).append(" ");
        }
        if(result.length()==0)
            return "";
            else return result.substring(0,result.length()-1);
    }
}

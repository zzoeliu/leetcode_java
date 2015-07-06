package string;

/**
 * Created by ZoeLiu on 7/5/15.
 * The count-and-say sequence is the sequence of integers beginning as follows:
 1, 11, 21, 1211, 111221, ...

 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.
 Given an integer n, generate the nth sequence.

 Note: The sequence of integers will be represented as a string.
 */
public class CountAndSay {
    public String countAndSay(int n)
    {
        StringBuffer result=new StringBuffer();
        if(n<10)
        {
            result.append(Integer.toString(1));
            result.append(Integer.toString(n));
            return result.toString();
        }
        String number=Integer.toString(n);
        int i=0;
        while(i<number.length())
        {
            char cur=number.charAt(i);
            int count=0;
            while(number.charAt(i)==cur)
            {
                i++;
                count++;
            }
            result.append(Integer.toString(count));
            result.append(cur);
        }
        return result.toString();
    }
}

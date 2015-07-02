package math;

/**
 * Created by ZoeLiu on 7/2/15.
 * Problem Description:
 * Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28

 design: other conversions between 10s,2s,8s,16s

 cur+=num[i]*(int)Math.pow(10/2/8/16,t)
 t++
 i--
 */
public class ExcelColNum {
    public int titleToNumber(String s) {

        if(s==null)
            return 0;
        int cur=0;
        int t=0;

        for(int i=s.length()-1;i>=0;i--)
        {
            int num=s.charAt(i)-'A'+1;
            cur+=num*(int)(Math.pow(26,t));
            t++;
        }
        return cur;
    }
}

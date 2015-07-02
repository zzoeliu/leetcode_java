package math;

import java.util.Collection;

/**
 * Created by ZoeLiu on 7/2/15.
 * Problem Description:
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

 For example:

 1 -> A
 2 -> B
 3 -> C
 ...
 26 -> Z
 27 -> AA
 28 -> AB

 design:
 It like a number represented by 26 digits.
 Use 26 to be divided and represent the remaining as A..Z

 Note:
 A is mapped to 1 not 0
 Z is mapped to 0
 so n need to do -1 before use.
 for example, 1 mapped to 'A'+0
 2 mapped to 'A'+1
 26 mapped to 'A'+25

 StringBuilder vs String vs StringBuffer

 http://www.blogjava.net/chenpengyi/archive/2006/05/04/44492.html
 */
public class ExcelColTitle {
    public String convertToTitle(int n) {

        if(n<=0) return null;

        StringBuilder result=new StringBuilder();


        int cur=n;

        while(cur!=0)
        {
            cur--;
            char ch=(char)((cur%26)+'A');
            result.append(ch);
            cur/=26;
        }

        result.reverse();
        return result.toString();

    }
}

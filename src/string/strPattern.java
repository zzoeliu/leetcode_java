package string;

/**
 * Created by ZoeLiu on 7/2/15.
 * Problem Description:
 * Implement strStr().

 Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 Update (2014-11-02):
 The signature of the function had been updated to return the index instead of the pointer. If you still see your
 function signature returns a char * or String, please click the reload button  to reset your code definition.

 * Diffuculty Level: 4
 * Frequency Level : 5
 * Algorithms : string
Note: Try other solutions.such as KMP
 */
public class strPattern {

    public int strStr(String haystack, String needle) {

        if(needle.length()==0) return 0;

        int i=0,j=0;
        while(i<haystack.length() && j<needle.length())
        {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                i=i-j+1;
                j=0;
            }
        }
        if(j<needle.length())
           return -1;
        else return i-j;

    }
}

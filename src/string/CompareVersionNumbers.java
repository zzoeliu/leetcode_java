package string;

import com.sun.org.apache.xml.internal.utils.StringComparable;

/**
 * Created by ZoeLiu on 7/4/15.
 * Compare two version numbers version1 and version2.
 If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

 You may assume that the version strings are non-empty and contain only digits and the . character.
 The . character does not represent a decimal point and is used to separate number sequences.
 For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

 Here is an example of version numbers ordering:

 0.1 < 1.1 < 1.2 < 13.37

 Note: string .split usage. "\\." use escape
 three situation: larger,smaller or equal. if equal need to compute the whole string.
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] ver1=version1.split("\\.");
        String[] ver2=version2.split("\\.");

        int minLength=Math.min(ver1.length,ver2.length);
        int i=0;

        while(i<minLength)
        {
            int a=Integer.valueOf(ver1[i]);
            int b=Integer.valueOf(ver2[i]);

            if(a>b) return 1;
            else if(a<b) return -1;
            i++;
        }
        i=0;
        int sum1=0;
        while(i<ver1.length)
        {
            sum1+=Integer.valueOf(ver1[i]);
            i++;
        }
        i=0;
        int sum2=0;
        while(i<ver2.length)
        {
            sum2+=Integer.valueOf(ver2[i]);
            i++;
        }
        if(sum1 == sum2) return 0;
        return ver1.length > ver2.length? 1:-1;
    }
}

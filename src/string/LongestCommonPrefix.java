package string;

/**
 * Created by ZoeLiu on 7/5/15.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs)
    {
        StringBuilder prefix=new StringBuilder();
        if(strs==null || strs.length==0) return prefix.toString();
        if(strs.length==1) return strs[0];
        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].length()<minLength)
            {
                minLength=strs[i].length();
            }
        }
        for(int i=0;i<minLength;i++)
        {
            char commonChar=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(strs[j].charAt(i)!=commonChar) {
                    return prefix.toString();
                }
            }
            prefix.append(commonChar);
        }
        return prefix.toString();
    }
}

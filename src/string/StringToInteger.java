package string;

/**
 * Created by ZoeLiu on 7/3/15.
 * Implement atoi to convert a string to an integer.

 Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself
 what are the possible input cases.

 Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to
 gather all the input requirements up front.
 *  Diffuculty Level: 2
 * Frequency Level : 5
 *
 * design:
 * atoi
 * 1.the first non-null character should be + or - or numbers, util hit non-number character.
 * 2.Special cases for integer.maxvalue && integer.minvalue, we need use double to hold the number ,
 * then convert it to int.
 */
public class StringToInteger {

    public int myAtoi(String str)
    {

        if(str==null || str.length()==0) return 0;
        int i=0;
        int flag=0;
        while(str.charAt(i)==' ') i++;
        if(str.charAt(i)=='-')
        {
            flag=1;
            i++;
        }else if(str.charAt(i)=='+')
        {
            i++;
        }
        else if(str.charAt(i)<'0' || str.charAt(i)>'9')
            return 0;
        double sum=0;
        while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9')
        {

            int num=str.charAt(i)-'0';
            sum=sum*10+num;
            i++;
        }
        if(flag==1) sum=-sum;

        if(sum>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(sum<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int)sum;

    }

}

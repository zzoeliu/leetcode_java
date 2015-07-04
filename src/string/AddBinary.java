package string;

/**
 * Created by ZoeLiu on 7/3/15.
 * Given two binary strings, return their sum (also a binary string).

 * For example,
 * a = "11"
 * b = "1"
 * Return "100"
 *
 * notice the carry bits
 *  Diffuculty Level: 2
 * Frequency Level : 4
 */
public class AddBinary {

    public String addBinary(String a, String b)
    {
        int alen=a.length()-1,blen=b.length()-1;
        int carry=0;
        StringBuffer result=new StringBuffer();

        while(alen>=0&&blen>=0)
        {
            int nums=carry+(int)(a.charAt(alen)-'0')+(int)(b.charAt(blen)-'0');
            carry=nums/2;
            result.append(nums%2);
            alen--;
            blen--;
        }


        while(alen>=0)
        {
            int nums=carry+(int)(a.charAt(alen)-'0');
            carry=nums/2;
            result.append(nums%2);
            alen--;

        }
        while(blen>=0)
        {
            int nums=carry+(int)(b.charAt(blen)-'0');
            carry=nums/2;
            result.append(nums%2);
            blen--;

        }
        if(carry==1)
            result.append(1);
        return result.reverse().toString();
    }
}

import math.CountPrime;
//import stack.ValidParentheses;
//import string.IsomorphicStrings;

import java.util.concurrent.CountDownLatch;

/**
 * Created by ZoeLiu on 7/2/15.
 */
public class ValidParentheseTest {
    public static void main(String[] args)
    {

        /*String s = "MMDCCXC";
        Roman2Integer rom2Int=new Roman2Integer();
        int result=rom2Int.RomanInteger(s);

        System.out.println(s+" is :"+ result);*/

        /*String s="]";
        ValidParentheses test=new ValidParentheses();
        System.out.println("The result is "+ test.isValid(s));*/
        /*IsomorphicStrings test=new IsomorphicStrings();
        String s="aa";
        String t="ab";
        System.out.println(test.isIsomorphic(s,t));*/
        CountPrime test=new CountPrime();
        int count=test.countPrimes(5);

    }
}

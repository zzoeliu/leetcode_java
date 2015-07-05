//import math.CountPrime;
import array.PascalTriangle;
import math.HapplyNumber;
import math.RectangleArea;
import math.ReverseInteger;
import stack.MinStack;
import string.CompareVersionNumbers;
import string.LongestCommonPrefix;
import string.StringToInteger;
import string.ZigzagConv;
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
        //CountPrime test=new CountPrime();
        //int count=test.countPrimes(5);
        //ZigzagConv test=new ZigzagConv();
        //String input="ABCD";
        //String output=new String();
        //output=test.convert(input,3);
        //System.out.println(output);

//        StringToInteger testClass=new StringToInteger();
  //      String test="2147483648";
    //    int num=testClass.myAtoi(test);
      //  System.out.println(num);
       // MinStack test=new MinStack();
        //test.push(-3);
        //int min=test.getMin();
        //System.out.println(min);
        //RectangleArea test=new RectangleArea();
        //int area=test.computeArea(-2, -2, 2, 2, 3, 3, 4, 4);
        //System.out.println(area);

        //HapplyNumber test=new HapplyNumber();

        //test.isHappy(19);
        //ReverseInteger test=new ReverseInteger();
        //test.reverse(2147483412);
        //CompareVersionNumbers test=new CompareVersionNumbers();
        //String a="1";
        //String b="0";
        //test.compareVersion(a,b);
        //LongestCommonPrefix test=new LongestCommonPrefix();
        //String[] testString={"a"};
       //String result = test.longestCommonPrefix(testString);
        PascalTriangle test=new PascalTriangle();
        test.generate(1);

    }
}

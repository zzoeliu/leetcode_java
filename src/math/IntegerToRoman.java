package math;

/**
 * Created by ZoeLiu on 7/6/15.
 * Given an integer, convert it to a roman numeral.

 Input is guaranteed to be within the range from 1 to 3999.
 */
public class IntegerToRoman {
    public String intToRoman(int num) {

        String[] ch={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String result=new String();
        int val=0;
        for(int i=0;val<=num;i++) {
            while (val < num) {
                val = val + nums[i];
                result+=ch[i];
            }
        }
        return result;
    }
}

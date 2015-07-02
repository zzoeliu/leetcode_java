package math;

/**
 * Created by ZoeLiu on 7/2/15.
 * Problem Description:
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

 For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.

 design: why n&(n-1) could caculate the count of 1 bits????
 n&(n-1)==0, 也可用来判断n是否是2的幂或者n是否为0
 */
public class NumOf1bits {
//n should be treated as unsigned int
public int hammingWeight(int n) {

    int count=0;
    int cur=n;
    if(n==0) return 0;
    while(cur!=0)
    {
        cur=cur&(cur-1);
        count++;
    }

    return count;

}
}



package array;

import java.util.ArrayList;

/**
 * Created by ZoeLiu on 7/5/15.
 * Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1].

 Note:
 Could you optimize your algorithm to use only O(k) extra space?
 * Diffuculty Level: 2
 * Frequency Level : 1
 * Algorithms : array
 */
public class PascalTriangleII {
    public java.util.List<Integer> getRow(int rowIndex)
    {
        PascalTriangle pascalTra=new PascalTriangle();
        return pascalTra.generate(rowIndex).get(rowIndex);


    }

}

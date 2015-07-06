package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZoeLiu on 7/5/15.
 *  * Diffuculty Level: 2
 * Frequency Level : 1
 * Algorithms : array
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> pascalTra=new ArrayList<List<Integer>>();
        if(numRows==0) return pascalTra;

        for(int i=0;i<numRows;i++)
        {
            ArrayList<Integer> rows=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {

                if(j==0 || j==i)
                {
                    rows.add(1);
                }
                else
                {
                    rows.add(pascalTra.get(i-1).get(j-1)+pascalTra.get(i-1).get(j));
                }
            }
            pascalTra.add(rows);

        }
        return pascalTra;

    }
}

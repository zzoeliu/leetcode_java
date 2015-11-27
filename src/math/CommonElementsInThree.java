package math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZoeLiu on 7/30/15.
 */
public class CommonElementsInThree {
    public List<Integer> common(int[] a , int[] b ,int[] c)
    {
        if(a == null || b == null || c == null || a.length == 0 || b.length == 0 || c.length == 0)
            return new ArrayList<Integer>();
        ArrayList<Integer> results = new ArrayList<Integer>();
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length && k<c.length)
        {
            if(a[i] == b[j] && a[i] == c[k])
            {
                results.add(a[i]);
                i++;
                j++;
                k++;
            }
            else if(a[i] <= b[j] && a[i] <= c[k])
            {
                i++;
            }
            else if(b[j] <= a[i] && b[j] <= c[k])
            {
                j++;
            }
            else k++;
        }
        return results;
    }

}

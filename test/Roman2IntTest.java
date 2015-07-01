import math.Roman2Integer;

/**
 * Created by ZoeLiu on 7/1/15.
 */
public class Roman2IntTest {

    public static void main(String[] args)
    {

        String s = "MMDCCXC";
        Roman2Integer rom2Int=new Roman2Integer();
        int result=rom2Int.RomanInteger(s);

        System.out.println(s+" is :"+ result);
    }

}

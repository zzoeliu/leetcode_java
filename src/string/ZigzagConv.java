package string;

/**
 * Created by ZoeLiu on 7/3/15.
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want
 * to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"
 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string text, int nRows);
 convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

 * Diffuculty Level: 3
 * Frequency Level : 1
 *
 * design:
 * exclude the first line and last line,cause both line have no extra elements to print
 */
public class ZigzagConv {

    public String convert(String s,int numRows)
    {

        if(s.length()<=numRows||numRows==1)
        {
            return s;
        }
        StringBuffer result=new StringBuffer();
        int size=2*(numRows-1);

        for(int i=0;i<numRows;i++)
        {
            for(int j=i;j<s.length();j+=size)
            {
                result.append(s.charAt(j));//print vertical columns
                if(i!=0 && i!=numRows-1 && j+size-2*i<s.length())
                    result.append(s.charAt(j+size-2*i));//print extra elements have a move of size - 2* i to the
                    // vertical elements.
            }
        }

        return result.toString();
    }
}

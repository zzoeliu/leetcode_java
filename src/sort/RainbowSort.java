package sort;

/**
 * Created by ZoeLiu on 7/29/15.
 */
public class RainbowSort {
    public int[] rainbowSort(int[] array) {
        // Write your solution here

        if(array.length==0) return array;
        int red=0,green=0,blue=0;

        for(int i=0;i<array.length;i++)
        {
            if(array[i]==-1)
                red++;
            else if(array[i]==0)
                green++;
            else if(array[i]==1)
                blue++;
            else return null;
        }
        if((red+green+blue) != array.length)
            return null;
        int index=0;
        while(red!=0)
        {
            array[index++]=-1;
            red--;
        }
        while(green!=0)
        {
            array[index++]=0;
            green--;
        }
        while(blue!=0)
        {
            array[index++]=1;
            blue--;
        }
        return array;
    }
}

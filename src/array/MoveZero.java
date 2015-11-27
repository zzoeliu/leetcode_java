package array;

/**
 * Created by ZoeLiu on 7/28/15.
 */
public class MoveZero {
    public int[] moveZero(int[] array) {
        // Write your solution here.
        if(array==null || array.length < 2) //Corner Case
            return array;
        int zStart=array.length-1;//Start point of 0 sequence
        while(array[zStart]==0)
            zStart--;
        for(int i=0;i<zStart && zStart>=0;i++)
        {
            if(array[i]==0)
            {//Find 0 from array begin and exchange with the start point of 0 sequence part
                int temp=array[zStart];
                array[zStart]=array[i];
                array[i]=temp;
                while(array[zStart]==0 && zStart>=0)//Move forward if we keep hitting 0s
                    zStart--;
            }
        }
        return array;
    }
}

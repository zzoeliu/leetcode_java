package tree;

/**
 * Created by ZoeLiu on 10/18/15.
 */
public class preOrder {
    public boolean isBST(int[] array){
        if(array == null || array.length <= 1)
            return true;
        //maintain low as the root, all following item should be larger than it
        int low = Integer.MIN_VALUE;
        int top = -1;
        for(int i = 0; i < array.length; i++){
            if (array[i] < low)
                return false;
            while(top >= 0 && array[i] > array[top]){
                low = array[top--];
            }
            array[++top] = array[i];
        }
        return true;
    }
}

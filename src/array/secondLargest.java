package array;

/**
 * Created by ZoeLiu on 10/21/15.
 */
public class secondLargest {
        public int[] largestAndSecond(int[] array) {
            // write your solution here
            // return a Pair object, the field first is the largest
            if(array == null || array.length <= 2){
                return array;
            }
            int i = 0, end = 0, second = Integer.MIN_VALUE;
            int size = array.length;
            while(size != 2){
                while(i < size - 1){
                    array[end++] = Math.max(array[i],array[i + 1]);
                    second = Math.max(second, Math.min(array[i],array[i + 1]));
                    i += 2;
                }
                if (i == size - 1){
                    array[end++] = Math.max(array[i], second);
                }else{
                    array[end++] = second;
                }
                size = end;
                end = 0;
                i = 0;
            }
            return new int[]{array[0], array[1]};
        }
}

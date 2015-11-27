package array;

import java.util.Scanner;

/**
 * Created by ZoeLiu on 10/18/15.
 */
public class flipOne {
    public static int flipOne(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }
        int ones = 0;//calculate how many 0s in this array
        int zeros = 0;//calculate till now how many zeros overcome 1
        int maxZeros = 0;//max zeros overcome 1
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                zeros++;

            }else{
                ones++;
                zeros--;

            }
            zeros = Math.max(zeros,0);
            maxZeros = Math.max(maxZeros,zeros);
        }
        return ones + maxZeros;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++){
            nums[i] = in.nextInt();
        }
        in.close();
        System.out.println(flipOne(nums));
    }
}

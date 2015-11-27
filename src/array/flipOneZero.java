package array;

import java.util.Scanner;

/**
 * Created by ZoeLiu on 11/23/15.
 */
public class flipOneZero {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrayLen = in.nextInt();
        //int[] array = new int[arrayLen];
        //for(int i = )
        int ones = 0;
        int zeros = 0;
        int maxZeros = 0;
        for(int i = 0; i < arrayLen; i++){
            int cur = in.nextInt();
            if(cur == 0){
                zeros++;
            }else{
                ones++;
                zeros--;
            }
            zeros = Math.max(zeros,0);
            maxZeros = Math.max(zeros,maxZeros);
        }
        System.out.println( ones + maxZeros);
    }
}

package math;

import java.util.Random;

/**
 * Created by ZoeLiu on 9/4/15.
 */
public class isNumber {
    /*public boolean isNumber(String s) {
        if(s == null || s.length() == 0)
            return false;
        s = s.trim();
        if(s == null || s.length() == 0)
            return false;
        char[] array = s.toCharArray();
        int i = 0;
        boolean isNumber = false;
        int N = array.length;
        if(i < N && array[i] == '+' || array[i] == '-') i++;
        while(i < N && Character.isDigit(array[i]))
        {
            i++;
            isNumber = true;
        }
        if(i < N && array[i] == '.')
        {
            i++;
            while(i<N &&Character.isDigit(array[i]))
            {
                i++;
                isNumber = true;
            }
        }

        if(isNumber && i < N && array[i] == 'e')
        {
            i++;
            if(i < N && (array[i] == '+' || array[i] == '-')) i++;
            isNumber = false;
            while(i<N &&Character.isDigit(array[i]))
            {
                i++;
                isNumber = true;
            }
        }
        return isNumber && i == N;
    }*/
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0){
            return false;
        }
        s = s.trim();
        if(s.length() == 0){
            return false;
        }
        char[] array = s.toCharArray();

        int i = 0;
        boolean digit = false;
            if((i < array.length) && (array[i] == '+' || array[i] == '-') && digit == false){
                i++;
            }
            while(i < array.length && Character.isDigit(array[i])){
                i++;
                digit = true;
            }
            if(i < array.length && digit == true && array[i] == '.'){
                i++;
            }
            while(i < array.length && digit == true && Character.isDigit(array[i])){
                i++;
                digit = true;
            }
            if(i < array.length && digit == true && array[i] == 'e'){
                i++;
            }
            digit = false;
            if((i < array.length) && (array[i] == '+' || array[i] == '-') && digit == false){
                i++;
            }
            digit = true;
            while(i < array.length && digit == true && Character.isDigit(array[i])){
                i++;
            }
        return i == array.length;

    }
}

package string;

/**
 * Created by ZoeLiu on 11/20/15.
 */
    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int line = in.nextInt();
            if(line < 2){
                System.out.println(0);
            }
            String[][] array = new String[line][4];
            in.nextLine();
            int realLine = 0;
            for(int i = 0; i < line;i++ ){
                String nextLine = in.nextLine();
                if(nextLine != null && nextLine.length() != 0) {
                    array[realLine] = nextLine.split(" ");
                    realLine++;
                }
            }
            /*for(int i = 0; i < line; i++){
                for(int j = 0; j < 4; j++){

                    System.out.println(array[i][j]);
                }
            }*/
            int result = 0;
            for(int i = 0; i < realLine - 1; i++){
                for(int j = i + 1; j < realLine; j++){
                    int k = 0;
                    for(; k < 4; k++){
                        String a = array[i][k];
                        String b = array[j][k];
                        if(!a.equals(b)){
                            break;
                        }
                    }
                    if(k == 3 && !array[i][3].equals(array[j][3])){
                        result++;
                        break;
                    }
                }
            }
            System.out.println(result);
        }
    }

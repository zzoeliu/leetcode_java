package string;

/**
 * Created by ZoeLiu on 9/24/15.
 */
public class AllUnique {
    public boolean allUnique(String word) {
        // write your solution here
        //Use bitmap to solve this problem
        //ASCII 1~256, we need 256/32 = 8 integer to store all these characters. each bit of the integger represents the occurence of character in string
        int[] bitmap = new int[8];
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int row = c / 32;
            int col = c % 32;
            int check = 1 << col;
            if ((bitmap[row] & check) != 0){
                //that means this character appears before;
                return false;
            }
            bitmap[row] |= check;
        }
        return true;
    }
}

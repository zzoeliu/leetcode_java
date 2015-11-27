package string;

/**
 * Created by ZoeLiu on 9/21/15.
 */
public class stringReverseN {

    public String rightShift(String input, int n) {
        // Write your solution here.
        //"abcdefg",2 ->"fgabcde"
        //so we first reverse abcde, then reverse fg, at last reverse the whole string to get our result
        //Step 1: corner case
        if (input == null || input.length() == 0 || n % input.length() == 0)
            return input;
        n = n % input.length();
        char[] array = input.toCharArray();

        reverse(array, 0, input.length() -n - 1);
        reverse(array, input.length() - n, input.length() - 1);
        reverse(array, 0, input.length() - 1);
        return new String(array);
    }
    private void reverse(char[] array, int left, int right){
        if  (left >= right)
            return;
        while (left < right){
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

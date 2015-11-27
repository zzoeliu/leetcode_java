package string;

/**
 * Created by ZoeLiu on 7/7/15.
 *
 * Note: String.equals is not the same as ==
 */
public class reverseWord {
    /*public String reverseWords(String s) {

        if(s==null || s.length()==0)
        return "";
        String[] temp=s.split(" ");
        StringBuilder result=new StringBuilder();

        for(int j=temp.length-1;j>=0;j--)
        {
            if(!temp[j].equals(""))
                result.append(temp[j]).append(" ");
        }
        if(result.length()==0)
            return "";
            else return result.substring(0,result.length()-1);
    }*/
    public String reverseWords(String input) {
        // write your solution here
        /*if (input == null || input.length() <= 1){
            return input;
        }
        String[] array = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--){
            result.append(array[i]);
            result.append(" ");
        }
        return result.toString().substring(0, result.length() - 1);
    }*/
        if (input == null || input.length() <= 1){
            return input;
        }
        char[] array = input.toCharArray();
        reverse(array, 0, array.length - 1);
        int i = 0;
        int start = 0, end = 0;
        while (i < array.length){
            if (array[i] != ' ' && (i == 0 || array[i - 1] == ' ')){
                start = i;
            }
            if (array[i] != ' ' && (i == array.length - 1  || array[i+1] == ' ') ){
                //end = i ;
                reverse(array, start, i);
            }
            //reverse(array, start, end); //This is wrong ,cause we only need to reverse when we get the end point, no need to reverse in each loop.
            i++;
        }
        return new String(array);
    }
    private void reverse(char[] array, int left, int right){
        if (left >= right)
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

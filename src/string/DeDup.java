package string;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by ZoeLiu on 9/16/15.
 */
public class DeDup {
    public String deDup(String input) {
        // write your solution here
        if (input == null || input.length() <= 1)
            return input;
        //Use a stack to store unique characters instead of an array.
        Deque<Character> stack = new LinkedList<Character>();
        stack.offerLast(input.charAt(0));
        for (int i = 1; i < input.length(); ){
            if(stack.isEmpty()){
                stack.offerLast(input.charAt(i));
                i++;
            }else {
                char c = stack.peekLast();
                if (input.charAt(i) == c) {
                    i++;
                    stack.pollLast();
                    while (i < input.length() && input.charAt(i) == c) {
                        i++;
                    }
                }else{
                    stack.offerLast(input.charAt(i));
                    i++;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pollFirst());
        }
        return result.toString();
    }
}

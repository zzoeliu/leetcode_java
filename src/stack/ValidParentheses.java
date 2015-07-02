package stack;

import java.util.Stack;

/**
 * Created by ZoeLiu on 7/2/15.
 *  Diffuculty Level: 2
 * Frequency Level : 5
 * Algorithms : Stack
 * Problem Description:
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 * Note:
 * difference between & and &&
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        String left = "([{";
        String right = ")]}";

        Stack<Character> symbolStack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (left.contains(s.subSequence(i, i + 1))) {
                symbolStack.push(s.charAt(i));
            } else if (right.contains(s.subSequence(i, i + 1))) {
                if (!symbolStack.isEmpty() && left.indexOf(symbolStack.peek()) == right.indexOf(s.charAt(i))) {
                    symbolStack.pop();
                }
                else return false;
            }
        }
        if(symbolStack.isEmpty())
            return true;
        else return false;
    }
}

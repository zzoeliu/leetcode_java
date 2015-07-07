package stack;

import java.util.Stack;

/**
 * Created by ZoeLiu on 7/7/15.
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        if(tokens.length==0 || tokens==null)
            return 0;
        int result;
        Stack<Integer> operant = new Stack<Integer>();
        for(int i=0;i<tokens.length;i++)
        {
            if(isNumber(tokens[i]))
            {
                operant.push(Integer.valueOf(tokens[i]));
            }else if(tokens[i]=="+")
            {
                int a=operant.pop();
                int b=operant.pop();
                operant.push(a+b);
            }
            else if(tokens[i]=="-")
            {
                int a=operant.pop();
                int b=operant.pop();
                operant.push(a-b);
            }else if(tokens[i]=="*")
            {
                int a=operant.pop();
                int b=operant.pop();
                operant.push(a*b);
            }else if(tokens[i]=="/")
            {
                int a=operant.pop();
                int b=operant.pop();
                operant.push(b/a);
            }
        }
        return operant.pop();
    }
    public boolean isNumber(String s)
    {
        if(s==null || s.length()==0)
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)<'0' || s.charAt(i)>'9')
                return false;
        }
        return true;
    }
}

package stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by ZoeLiu on 9/4/15.
 */
public class simplePath {
    public String simplifyPath(String path) {
        if(path == null || path.length() == 0)
            return path;
        Deque<String> stack = new LinkedList<String>();
        String[] array = path.split("/");
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == ".." )
            {
                if(!stack.isEmpty())
                    stack.pollLast();
            }
            else if(array[i] .length() == 0 || array[i] == "." )
            {

            }
            else
            {
                stack.offerLast(array[i]);
            }

        }
        StringBuilder result = new StringBuilder();

        if(stack.isEmpty())
        {
            stack.offerLast("");

        }
        while(!stack.isEmpty())
        {
            result.append("/");
            result.append(stack.pollFirst());
        }
        return result.toString();
    }
}

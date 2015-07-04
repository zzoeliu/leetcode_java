package stack;

import java.util.ArrayList;

/**
 * Created by ZoeLiu on 7/4/15.
 */
public class MinStack {
    ArrayList<Integer> stackList=new ArrayList<Integer>();
    public void push(int x) {

        this.stackList.add(x);
    }

    public void pop() {
        this.stackList.remove(stackList.size()-1);
    }

    public int top() {
        int top=this.stackList.get(stackList.size()-1);
        return top;

    }

    public int getMin() {
        int min=Integer.MIN_VALUE;

        for(int i=0; i<this.stackList.size();i++)
        {
            if(this.stackList.get(i)<min)
            {
                min=this.stackList.get(i);
            }
        }
        return min;

    }
}

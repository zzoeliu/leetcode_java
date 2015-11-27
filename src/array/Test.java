/*import java.util.Stack;

public class Test {

    private Stack<Integer> inStack;
    private Stack<Integer> outStack;
    private int size;
    public Solution() {
        // Write your solution here.
        inStack = new Stack<Integer>();
        outStack = new Stack<Integer>();
        size = 0;
    }

    public Integer poll() {
        while(!outStack.isEmpty())
            outStack.pop();//clear the current outstack
        while(!inStack.isEmpty())
            outStack.push(inStack.pop());
        if(!outStack.isEmpty())
        {
            size --;
            return outStack.pop();

        }else
            return null;
    }

    public void offer(int element) {
        inStack.push(element);
        size++;
    }

    public Integer peek() {
        while(!outStack.isEmpty())
            outStack.pop();//clear the current outstack
        while(!inStack.isEmpty())
            outStack.push(inStack.pee);
        if(!outStack.isEmpty())
        {

            size --;
            return outStack.peek();
        }else
            return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}*/
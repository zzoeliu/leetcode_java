package array;

/**
 * Created by ZoeLiu on 10/19/15.
 */
/*import java.io.*;
import java.util.*;
//Time complexity: O(n), n is the length of preorder array
//Space complexity: O(1), we use the visited array positions as stack
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
/*        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        for(int j = 0; j < testcase; j++){
            int n = in.nextInt();
            int[] preOrder = new int[n];
            for (int i = 0; i < n; i++){
                preOrder[i] = in.nextInt();
            }
            boolean flag = isBST(preOrder);
            String result = flag ? "YES" : "NO";
            System.out.println(result);
        }
    }
    public static boolean isBST(int[] preOrder){
        //Step 1 : corner case. Null tree or tree with only one element
        if (preOrder == null || preOrder.length <= 1){
            return true;
        }
        //Maintain low as the root of current subtree. All following nodes should be larger than it in BST.
        int low = Integer.MIN_VALUE;
        //Use top index to simulate stack. Assign value to ++top means push. top-- means pop.
        int top = -1;
        //Step 2 : traverse the preOrder array. if current value larger than stack peek(that means top element), keep on poping it up until we meet a smaller one, at the same time we need to maintain the low value. If current value smaller than stack peek, we can just push it into the stack.
        for (int i = 0; i < preOrder.length; i++){
            //Current value should be in the right subtree of low root. It should be larger than low root.
            if (preOrder[i] < low){
                return false;
            }
            //pop all smaller peek elements(the left subtree of low root) from stack
            while (top >= 0 && preOrder[i] > preOrder[top]){
                low = preOrder[top--];
            }
            preOrder[++top] = preOrder[i];
        }
        return true;
    }
}*/
import java.io.*;
import java.util.*;
public class Solution {
    public static class SuperStack{
        Deque<Integer> stack;
        int size;
        public SuperStack(){
            stack = new LinkedList<Integer>();
            size = 0;
        }
        public int push(int key){
            stack.offerLast(key);
            size++;
            //System.out.println(stack.peek());
            return key;
        }
        public int pop(){

            stack.pollLast();
            size--;
            if (stack.isEmpty()){
                //System.out.println("EMPTY");
                return 0;
            }
            int result = stack.peekLast();
            return result;
        }
        public int inc(int bom, int dis){
            bom %= size;
            if (bom == 0){
                bom = size;
            }
            Deque<Integer> tempStack = new LinkedList<Integer>();
            for (int i = 0; i < bom; i++){
                tempStack.offerLast(stack.pollFirst() + dis);
            }
            for (int i = 0; i < bom; i++){
                stack.offerFirst(tempStack.pollLast());
            }
            return stack.peekLast();
        }
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        SuperStack stack = new SuperStack();
        PrintWriter out = new PrintWriter(System.out, true);
        for (int i = 0; i < n; i++){
            String s = in.next();
            if (s.equals("push")){
                int value = in.nextInt();
                out.println(stack.push(value));
            } else if(s.equals("pop")){
                int res = stack.pop();
                if (stack.size == 0){
                    out.println("EMPTY");
                }else {
                    out.println(res);
                }
            } else if(s.equals("inc")){
                int x = in.nextInt();
                int d = in.nextInt();
                out.println(stack.inc(x,d));
            }
        }
        out.close();
    }
}

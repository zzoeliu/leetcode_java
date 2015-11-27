package recursive;

import java.io.*;
import java.util.*;
/*public class Solution {
    public static class SuperStack{
        Deque<Integer> stack;
        int size;
        public SuperStack(){
            stack = new LinkedList<Integer>();
            size = 0;
        }
        public int push(int key){
        //Same push as traditional stack data structure
            stack.offerLast(key);
            size++;
            return key;
        }
        public int pop(){
        //pop operation poll the top element, and return current super stack's top item
            stack.pollLast();
            size--;
            if (stack.isEmpty()){
                return 0;
            }
            int result = stack.peekLast();
            return result;
        }
        public int inc(int bom, int dis){
            //check if bom is larger than size, we will do modular if bom size is larger than stack size.
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
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        SuperStack stack = new SuperStack();
        PrintWriter out = new PrintWriter(System.out,true);
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
}*/
import java.io.*;
import java.util.*;
/*public class solution {
    static final int CAPACITY = 500000;
    public static class SuperStack{
        long[] stack;
        int size;
        public SuperStack(){
            stack = new long[CAPACITY];
            size = 0;
        }
        public int push(int key){
            //Same push as traditional stack data structure
            //stack.offerLast(key);
            stack[size++] = key;
            return key;
        }
        public long pop(){
            //pop operation poll the top element, and return current super stack's top item
            size--;
            if (size == 0){
                return 0;
            }
            long result = stack[size - 1];
            return result;
        }
        public long inc(int bom, int dis){
            //check if bom is larger than size, we will do modular if bom size is larger than stack size.
            bom %= size;
            if (bom == 0){
                bom = size;
            }
            for (int i = 0; i < bom; i++){
                stack[i] = stack[i] + dis;
            }
            return stack[size - 1];
        }
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        SuperStack stack = new SuperStack<Long>();
        PrintWriter out = new PrintWriter(System.out,true);
        for (int i = 0; i < n; i++){
            String s = in.next();
            if (s.equals("push")){
                int value = in.nextInt();
                out.println(stack.push(value));
            } else if(s.equals("pop")){
                long res = stack.pop();
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
}*/
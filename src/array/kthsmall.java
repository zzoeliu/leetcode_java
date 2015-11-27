package array;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by ZoeLiu on 8/23/15.
 */

/**public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // Write your solution here
        // Dijkstra's algorithm
        assert(matrix != null);
        int leny = matrix.length;
        int lenx = matrix[0].length;
        boolean[][] visitor = new boolean[leny][lenx];
        int result = Integer.MIN_VALUE;
        PriorityQueue<MatrixNode> pQueue = new PriorityQueue<MatrixNode>(k,new Comparator<MatrixNode>(){
            public int compare(MatrixNode m1,MatrixNode m2){
                if(m1.val == m2.val)
                    return 0;
                return m1.val < m2.val ? -1:1;
            }
        });
        pQueue.offer(new MatrixNode(0,0,matrix[0][0]));
        visitor[0][0] = true;
        for(int i = 0; i< k; i++)
        {
            MatrixNode tempNode = pQueue.poll();
            result = tempNode.val;
            if(tempNode.row < lenx - 1 && !visitor[tempNode.row + 1][tempNode.column] )
            {//the next row
                pQueue.offer(new MatrixNode(tempNode.row + 1,tempNode.column,matrix[tempNode.row + 1][tempNode.column]));
                visitor[tempNode.row + 1][tempNode.column] = true;
            }
            if(tempNode.column < leny - 1 && !visitor[tempNode.row][tempNode.column + 1] )
            {//the next column
                pQueue.offer(new MatrixNode(tempNode.row,tempNode.column + 1,matrix[tempNode.row][tempNode.column + 1]));
                visitor[tempNode.row][tempNode.column + 1] = true;
            }
        }
        return result;
    }
    static class MatrixNode{
        int row;
        int column;
        int val;
        MatrixNode(int x, int y,int value)
        {
            row = x;
            column = y;
            val = value;
        }

    }
}***/


public class kthsmall {
    public static class Node{
        int i;
        int j;
        int sum;
        public Node(int x, int y, int result){
            i = x;
            j = y;
            sum = result;
        }
    }
    public int kthSum(int[] A, int[] B, int k) {
        PriorityQueue<Node> pq = new PriorityQueue<Node>(k, new Comparator<Node>(){
            public int compare(Node n1, Node n2){
                if(n1.sum == n2.sum){
                    return 0;
                }
                return n1.sum > n2.sum ? -1 : 1;
            }
        });
        int a = A.length;
        int b = B.length;
        boolean[][] visited = new boolean[a][b];
        Node temp = new Node(0,0, A[0] + B[0]);
        visited[0][0] = true;
        int sum = A[0] + B[0];
        for(int i = 0; i < k; i++){
            temp = pq.poll();
            int x = temp.i;
            int y = temp.j;
            sum = temp.sum;
            if(x < a - 1 && visited[x + 1][y] == false){
                pq.offer(new Node(x + 1, y, A[x + 1] + B[y]));
                visited[x + 1][y] = true;
            }
            if(y < b - 1 && visited[x][y + 1] == false){
                pq.offer(new Node(x, y + 1, A[x]+ B[y + 1]));
                visited[x][y + 1] = true;
            }
            if(x < a - 1 && y < b - 1 && visited[x + 1][y + 1] == false){
                pq.offer(new Node(x + 1, y + 1, A[x + 1]+ B[y + 1]));
                visited[x + 1][y + 1] = true;
            }
        }
        return sum;
        // Write your solution here
        //Use k-sized maxheap to get the kth smallest sum
    /*PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, new Comparator<Integer>(){
      public int compare(Integer i1, Integer i2){
        if(i1.equals(i2))
        return 0;
        return i1 > i2 ? -1 : 1;
      }
    });
    int a = Math.min(k, A.length);
    int b = Math.min(k, B.length);
    for(int i = 0; i < a; i++)
    for(int j = 0; j < b; j++){
      int cur = A[i] + B[j];
      if(pq.size() < k){
        pq.offer(cur);
      }else{
        int top = pq.peek();
        if(cur < top){
          pq.poll();
          pq.offer(cur);
        }
      }
    }
    return pq.peek();*/
        //the following solution can not handle duplicate
    /*int result = 0;
    int i = 0, j = 0;
    while(k != 1 && i + 1 < A.length && j + 1< B.length){
      int a = A[i + 1] + B[j];
      int b = A[i] + B[j + 1];
      int c = A[i + 1] + B[j + 1];
      if(a < b && a < c){
        i++;
        result = a;
      }else if(b < a && b < c){
        j++;
        result = b;
      }else if(c < a && c < b){
        i++;
        j++;
        result = c;
      }
      k--;
    }
    if(i == A.length - 1){
      while(k != 1){
        result = A[i] + B[j++];
      }
    }
    if(j == A.length - 1){
      while(k != 1){
        result = A[i++] + B[j];
      }
    }
    return result;*/

    }
}


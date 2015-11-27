package graph;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ZoeLiu on 9/29/15.
 */
public class WordLadderI {
    public int getLength(String beginWord, String endWord, List<String> dict){
        //Use BFS to get the shortest path between beginWord and endWord
        //Use additional data structures queues to record the nodes in BFS traverse of graph nodes, and distance separately
        Deque<String> queue = new LinkedList<String>();
        Deque<Integer> len = new LinkedList<Integer>();

        queue.offer(beginWord);
        len.offer(1);
        while (!queue.isEmpty()){
            String cur = queue.poll();
            int curLen = len.poll();
            if (cur.equals(endWord)){
                return curLen;
            }
            for (int i = 0; i < cur.length(); i++){

                char[] array = cur.toCharArray();
                for (array[i] = 'a'; array[i] <= 'z'; array[i]++){
                    String tempString = new String(array);
                    if(dict.contains(tempString)){
                        queue.offer(tempString);
                        len.offer(curLen + 1);
                        dict.remove(tempString);
                    }
                }
            }
        }
        return 0;
    }
}

package array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by ZoeLiu on 9/16/15.
 */
public class topKfrequent {
    public String[] topKFrequent(String[] combo, int k) {
        // Write your solution here.
        //Use minheap to solve this problem, comparator should be implemented by the frequency
        if (combo == null || combo.length == 0) return combo;
        //
        final Map<String, Integer> hashmap = new HashMap<String, Integer>();
        PriorityQueue<String> queue = new PriorityQueue<String>(k, new Comparator<String>(){
            public int compare(String s1, String s2){
                int n1 = hashmap.get(s1);
                int n2 = hashmap.get(s2);
                if (n1 == n2) return 0;
                if (n1 < n2) return -1;
                else return 1;
            }
        });
        for (int i = 0; i < combo.length; i++){
            if (hashmap.containsKey(combo[i])){
                int count = hashmap.get(combo[i]);
                hashmap.put(combo[i],count + 1);
            }else{
                hashmap.put(combo[i],1);
            }
        }
        for (Map.Entry<String,Integer> entry : hashmap.entrySet()){
            if(queue.size() < k){
                queue.offer(entry.getKey());
            }else if (hashmap.get(entry.getKey()) > hashmap.get(queue.peek())) {
                queue.poll();
                queue.offer(entry.getKey());
            }
        }
        String[] result = new String[queue.size()];
        for(int i = queue.size() - 1; i >= 0; i--){
            result[i] = queue.poll();
        }
        return result;
    }
}

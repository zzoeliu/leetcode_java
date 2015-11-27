package math;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by ZoeLiu on 9/27/15.
 */
public class Median {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;
    int count;
    public Median() {
        // add new fields and complete the constructor if necessary.
        minHeap = new PriorityQueue<Integer>();
        maxHeap = new PriorityQueue<Integer>(11,new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                if(i1.equals(i2))
                    return 0;
                return i1 > i2 ? -1 : 1;
            }
        });
    }

    public void read(int value) {
        // write your implementation here.
        // we need to maintain the  size of min heap greater than max heap no more than 2.
        //Min heap is greater than max heap
        count++;
        if (minHeap.isEmpty()){
            //insert value based on minHeap.peek()
            minHeap.offer(value);
            return;
        }else {
            int min = minHeap.peek();
            if (value <= min) minHeap.offer(value);
            else maxHeap.offer(value);
        }
        if (minHeap.size() - maxHeap.size() >= 2){
            //maintain the minHeap and maxHeap
            maxHeap.offer(minHeap.poll());
        }else if(minHeap.size() < maxHeap.size()){
            minHeap.offer(maxHeap.poll());
        }
    }

    public Double median() {
        // write your implementation here.
        if (count == 0)
            return null;
        if (count%2 != 0)
            return (double)minHeap.peek();
        else{
            int min = minHeap.peek();
            int max = maxHeap.peek();
            return (max + min)/(2.0);
        }
    }
}

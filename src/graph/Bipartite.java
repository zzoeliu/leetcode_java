package graph;

import java.util.*;

/**
 * Created by ZoeLiu on 9/18/15.
 */
public class Bipartite {
    /**
     * public class GraphNode {
     *   public int key;
     *   public List<GraphNode> neighbors;
     *   public GraphNode(int key) {
     *     this.key = key;
     *     this.neighbors = new ArrayList<GraphNode>();
     *   }
     * }
     */
        public boolean isBipartite(List<GraphNode> graph) {
            // write your solution here
            // Use BFS to do bipartite
            assert (graph != null && graph.size() != 0);
            //Step 1: Use hashmap to store graphnode, color pair, and initial.
            //We need to pass this hashmap to each node traverse to check if this node has been visited
            Map<GraphNode, Integer> hashmap = new HashMap<GraphNode, Integer>();
            for (int i = 0; i < graph.size(); i++){
                if(!helper(graph.get(i), hashmap)){
                    return false;
                }
            }
            return false;
        }
        private boolean helper(GraphNode node, Map<GraphNode, Integer> hashmap){
            //check if node has been traversed.
            if (hashmap.containsKey(node)){
                return true;
            }
            //start from node to do BFS
            //Step 1: Initialize a queue with node as start node to record traverse level
            Deque<GraphNode> queue = new LinkedList<GraphNode>();
            queue.offerFirst(node);
            hashmap.put(node, 0);
            //Step 2:
            while (!queue.isEmpty()){
                GraphNode temp = queue.pollLast();
                int col = hashmap.get(temp) == 0 ? 1 : 0;
                for (GraphNode neighbor : temp.neighbors){
                    if (!hashmap.containsKey(neighbor)){
                        hashmap.put(neighbor, col);
                        queue.offerFirst(neighbor);
                    } else {
                        if (hashmap.get(neighbor) != col){
                            return false;
                        }
                    }
                }
            }
            return true;
        }
}

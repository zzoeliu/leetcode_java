package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZoeLiu on 9/20/15.
 */
public class GraphNode {
    public int key;
    public List<GraphNode> neighbors;

    public GraphNode(int key) {
        this.key = key;
        this.neighbors = new ArrayList<GraphNode>();
    }
}

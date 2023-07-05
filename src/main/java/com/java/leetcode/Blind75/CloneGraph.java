package com.java.leetcode.Blind75;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    public Node cloneGraph(Node node){
        return cloneGraph(node, new HashMap<>());
    }

    private Node cloneGraph(Node node, Map<Node, Node> map){
        if(node == null)
            return null;
        if(map.containsKey(node)){
            return map.get(node);
        }
        Node duplicate = new Node(node.val);
        map.put(node, duplicate);
        for(Node ng:node.neighbors)
            duplicate.neighbors.add(cloneGraph(ng, map));
        return duplicate;
    }
}

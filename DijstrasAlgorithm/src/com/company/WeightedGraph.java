package com.company;

import javax.print.DocFlavor;
import java.util.*;

public class WeightedGraph {

    private Map<String, Node> nodes = new HashMap<>();

    public void addNode(String destination)
    {
        nodes.putIfAbsent(destination, new Node(destination));
    }

    public void addEdge(String from, String to, Integer weight)
    {
        var fromNode = nodes.get(from);
        if(fromNode == null)
            throw new IllegalArgumentException();

        var toNode = nodes.get(to);
        if(toNode == null)
            throw new IllegalArgumentException();

        fromNode.addEdge(toNode, weight);
        toNode.addEdge(fromNode, weight);
    }

    public void print() {
        for (var node : nodes.values()) {
            var edges = node.getEdges();
            if (!edges.isEmpty())
                System.out.println(node.toString() + " is connected to : " + edges);

        }
    }

    public List<String> getShortestPath(String from, String to)
    {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);

        Map<Node, Integer> distances = new HashMap<>();
        for(var node : nodes.values()) {
            distances.put(node, Integer.MAX_VALUE);
        }

        distances.replace(fromNode, 0);

        Map<Node, Node> previousNode = new HashMap<>();
        Set<Node> visited = new HashSet<>();

        PriorityQueue<NodeEntry> queue = new PriorityQueue<>(Comparator.comparingInt(ne -> ne.getShortestDistance()));
        queue.add(new NodeEntry(fromNode, 0));

        while(!queue.isEmpty())
        {
           var currentVertex = queue.remove().getNode();
           visited.add(currentVertex);

           for(var edge : currentVertex.getEdges())
           {
               if(!visited.contains(edge.getToNode()))
               {
                   var currentDistance = distances.get(currentVertex) + edge.getWeight();

                    if(distances.get(edge.getToNode()) > currentDistance) {
                        distances.replace(edge.getToNode(), currentDistance);

                        var toNodeEdge = new NodeEntry(edge.getToNode(), currentDistance);
                        if(!queue.contains(toNodeEdge)) {
                            queue.add(new NodeEntry(edge.getToNode(), currentDistance));
                            previousNode.put(edge.getToNode(), currentVertex);
                        }
                    }
               }
           }

        }
       // System.out.println("Shortest Path from " + to + " to " +from+" is : "+ shortestPath);
        List<String> shortestPath = new ArrayList<>();
        Stack<String> path = getPath(toNode, previousNode);
        while(!path.isEmpty())
            shortestPath.add(path.pop());


        return shortestPath;
    }

    private Stack<String> getPath(Node toNode, Map<Node, Node> previousNode)
    {

        Stack<String> shortestPath = new Stack<>();
        shortestPath.add(toNode.toString());

        var currentNode = toNode;
        while(previousNode.get(currentNode) != null) {
            var preNode = previousNode.get(currentNode);
            shortestPath.add(preNode.toString());
            currentNode = preNode;
        }
        return shortestPath;
    }


}

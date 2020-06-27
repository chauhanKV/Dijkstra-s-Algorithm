package com.company;


import java.util.ArrayList;
import java.util.List;

public class Node
{
    private String destination;
    private List<Edge> edges = new ArrayList<>();

    public Node(String destination) {
        this.destination = destination;
    }

    public void addEdge(Node to, Integer weight)
    {
        edges.add(new Edge(this, to , weight));
    }

    public List<Edge> getEdges()
    {
        return edges;
    }

    @Override
    public String toString() {
        return destination;
    }
}

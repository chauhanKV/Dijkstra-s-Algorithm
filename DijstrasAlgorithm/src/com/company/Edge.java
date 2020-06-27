package com.company;

public class Edge
{
    private Node from;
    private Node to;
    private Integer weight;

    public Edge(Node from, Node to, Integer weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return from.toString() + "->" + to.toString();
    }

    public Node getFromNode()
    {
        return from;
    }

    public Node getToNode()
    {
        return to;
    }

    public Integer getWeight()
    {
        return weight;
    }
}

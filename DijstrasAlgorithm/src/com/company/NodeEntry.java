package com.company;

public class NodeEntry
{

    private Node node;
    private Integer shortestDistance;


    public NodeEntry(Node node, Integer shortestDistance) {
        this.node = node;
        this.shortestDistance = shortestDistance;
    }


    public Integer getShortestDistance() {
        return shortestDistance;
    }

    public Node getNode() {
        return node;
    }
}
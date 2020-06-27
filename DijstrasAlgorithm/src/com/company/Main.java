package com.company;

public class Main {

    public static void main(String[] args) {
        WeightedGraph weightedGraph = new WeightedGraph();
        weightedGraph.addNode("A");
        weightedGraph.addNode("B");
        weightedGraph.addNode("C");
        weightedGraph.addNode("D");
        weightedGraph.addNode("E");
        weightedGraph.addNode("F");
        weightedGraph.addNode("G");

        weightedGraph.addEdge("A", "B", 1);
        weightedGraph.addEdge("A", "F", 21);
        weightedGraph.addEdge("A", "C", 3);

        weightedGraph.addEdge("B", "D", 16);

        weightedGraph.addEdge("C", "G", 10);
        weightedGraph.addEdge("C", "E", 4);

        weightedGraph.addEdge("D", "F", 1);

        weightedGraph.addEdge("E", "G", 2);

        weightedGraph.addEdge("F", "G", 7);

        weightedGraph.print();

        System.out.println("Shortest Path from A to F is : "+ weightedGraph.getShortestPath("A", "F"));

    }
}

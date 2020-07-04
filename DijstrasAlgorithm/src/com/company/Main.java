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


        WeightedGraph weightedGraph1 = new WeightedGraph();
        weightedGraph1.addNode("A");
        weightedGraph1.addNode("B");
        weightedGraph1.addNode("C");

        weightedGraph1.addEdge("A", "B", 1);
        weightedGraph1.addEdge("B", "C", 10);
        weightedGraph1.addEdge("C", "A", 12);

//        var hasCycle = weightedGraph1.hasCycle();
//        System.out.println("Has Cycle ? : " + hasCycle);

        System.out.println("Minimum Spanning Tree");
        WeightedGraph weightedGraph2 = new WeightedGraph();
        weightedGraph2.addNode("A");
        weightedGraph2.addNode("B");
        weightedGraph2.addNode("C");
        weightedGraph2.addNode("D");

        weightedGraph2.addEdge("A", "B", 3);
        weightedGraph2.addEdge("B", "D", 4);
        weightedGraph2.addEdge("C", "D", 5);
        weightedGraph2.addEdge("A", "C", 1);
        weightedGraph2.addEdge("B", "C", 2);





        weightedGraph2.print();

        weightedGraph2.getMinimumSpanningTree();



    }
}

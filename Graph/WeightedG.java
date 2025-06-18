package Graph;

import java.util.*;

public class WeightedG {
    static class Edge {
        int src;
        int dis;
        int wit;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dis = d;
            this.wit = w;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));

        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
    }

    public static void main(String[] args) {
        int v = 5; // vertices , size of graph
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        CreateGraph(graph);
        // Print 2's neighbours
        for (int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);
            System.out.println(e.dis + " " + e.wit);
        }
    }
}

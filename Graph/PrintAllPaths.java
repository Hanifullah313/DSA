package Graph;

import java.util.*;

public class PrintAllPaths {
    static class Edge {
        int src;
        int dis;

        public Edge(int s, int d) {
            this.src = s;
            this.dis = d;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 1));
        graph[1].add(new Edge(1, 1));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 1));
        graph[5].add(new Edge(5, 1));
        graph[5].add(new Edge(5, 1));
        graph[5].add(new Edge(6, 1));
    }

    public static void bfs(ArrayList<Edge> graph[], int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[v];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.println(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dis);
                }
            }
        }
    }

    public static void printAllPaths(ArrayList<Edge> graph[], int src, int tar, String path, boolean vis[]) {
        //O(v^V)
        if (src == tar) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!vis[e.dis]) {
                vis[e.dis] = true;
                printAllPaths(graph, e.dis, tar, path + "->" + e.dis, vis);
                vis[e.dis] = false;
            }
        }
    }

    public static void main(String args[]) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        int src = 0;
        int tar = 5;
        boolean vis[] = new boolean[V];
        vis[src] = true;
        printAllPaths(graph, src, tar, "" + src, vis);
    }
}

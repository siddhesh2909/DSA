import java.util.*;
import java.io.*;

public class Solution {
    static class Graph {
        private int V;
        private List<List<Integer>> adj;
        private int time;

        public Graph(int V) {
            this.V = V;
            this.adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            this.time = 0;
        }

        public void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        public List<Integer> findArticulationPoints() {
            boolean[] visited = new boolean[V];
            int[] disc = new int[V];
            int[] low = new int[V];
            int[] parent = new int[V];
            boolean[] ap = new boolean[V];

            Arrays.fill(parent, -1);

            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    APUtil(i, visited, disc, low, parent, ap);
                }
            }

            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                if (ap[i]) {
                    result.add(i);
                }
            }

            Collections.sort(result);
            return result;
        }

        private void APUtil(int u, boolean[] visited, int[] disc, int[] low, int[] parent, boolean[] ap) {
            int children = 0;
            visited[u] = true;
            disc[u] = low[u] = ++time;

            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    parent[v] = u;
                    children++;
                    APUtil(v, visited, disc, low, parent, ap);

                    low[u] = Math.min(low[u], low[v]);

                    if (parent[u] == -1 && children > 1) {
                        ap[u] = true;
                    }

                    if (parent[u] != -1 && low[v] >= disc[u]) {
                        ap[u] = true;
                    }
                } else if (v != parent[u]) {
                    low[u] = Math.min(low[u], disc[v]);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Graph g = new Graph(n);

        for (int i = 0; i < n - 1; i++) {
            String[] edge = br.readLine().split(" ");
            int u = Integer.parseInt(edge[0]);
            int v = Integer.parseInt(edge[1]);
            g.addEdge(u, v);
        }

        List<Integer> articulationPoints = g.findArticulationPoints();

        for (int point : articulationPoints) {
            System.out.println(point);
        }
    }
}
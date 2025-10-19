import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[n];
        return hasPath(graph, source, destination, visited);
    }

    private boolean hasPath(List<List<Integer>> graph, int src, int dest, boolean[] visited) {
        if (src == dest) return true;
        visited[src] = true;

        for (int neighbor : graph.get(src)) {
            if (!visited[neighbor]) {
                if (hasPath(graph, neighbor, dest, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}

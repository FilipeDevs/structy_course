import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

class Source {

    public static boolean undirectedPath(List<List<String>> edges, String nodeA, String nodeB) {
        HashMap<String, List<String>> graph = buildGraph(edges);
        HashSet<String> visited = new HashSet<>(); // prevent infinite cycles

        return traverseDfs(graph, nodeA, nodeB, visited);
    }

    public static boolean traverseDfs(HashMap<String, List<String>> graph, String src, String dest,
            HashSet<String> visited) {

        if (visited.contains(src)) { // prevent infinite cycles
            return false;
        }

        if (src.equals(dest)) { // prevent infinite cycles
            return true;
        }

        visited.add(src);

        for (String neighbour : graph.get(src)) {
            if (traverseDfs(graph, neighbour, dest, visited)) {
                return true;
            }
        }

        return false;
    }

    public static HashMap<String, List<String>> buildGraph(List<List<String>> edges) {
        HashMap<String, List<String>> graph = new HashMap<>();

        for (List<String> edge : edges) {
            String nodeA = edge.get(0);
            String nodeB = edge.get(1);

            if (!graph.containsKey(nodeA)) {
                graph.put(nodeA, new ArrayList<String>());
            }

            if (!graph.containsKey(nodeB)) {
                graph.put(nodeB, new ArrayList<String>());
            }

            graph.get(nodeA).add(nodeB);
            graph.get(nodeB).add(nodeA);
        }

        return graph;
    }
}
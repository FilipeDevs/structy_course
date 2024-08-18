import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;

class Source {

    public static int shortestPath(List<List<String>> edges, String nodeA, String nodeB) {

        HashMap<String, List<String>> graph = buildGraph(edges);
        Queue<SimpleEntry<String, Integer>> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();

        queue.add(new SimpleEntry<String, Integer>(nodeA, 0)); // add src node
        visited.add(nodeA);

        while (!queue.isEmpty()) {
            SimpleEntry<String, Integer> entry = queue.remove();
            String node = entry.getKey();
            int distance = entry.getValue();

            if (node == nodeB) {
                return distance;
            }

            for (String neighbor : graph.get(node)) {
                if (!visited.contains(neighbor)) {
                    queue.add(new SimpleEntry<>(neighbor, distance + 1));
                    visited.add(neighbor);
                }
            }
        }

        return -1;
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
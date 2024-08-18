import java.util.Map;
import java.util.List;
import java.util.HashSet;

class Source {
    public static boolean hasCycle(Map<String, List<String>> graph) {

        HashSet<String> visiting = new HashSet<>();
        HashSet<String> visited = new HashSet<>();

        for (String node : graph.keySet()) {
            if (traverseGraphDfs(graph, node, visiting, visited)) {
                return true;
            }
        }

        return false;
    }

    public static boolean traverseGraphDfs(Map<String, List<String>> graph, String src,
            HashSet<String> visiting, HashSet<String> visited) {
        if (visited.contains(src)) {
            return false;
        }

        if (visiting.contains(src)) {
            return true;
        }

        visiting.add(src);

        for (String neighbour : graph.get(src)) {
            if (traverseGraphDfs(graph, neighbour, visiting, visited)) {
                return true;
            }
        }

        visiting.remove(src);
        visited.add(src);

        return false;
    }
}
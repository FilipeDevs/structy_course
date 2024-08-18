import java.util.Map;
import java.util.List;
import java.util.HashSet;

class Source {

    public static int largestComponent(Map<Integer, List<Integer>> graph) {

        HashSet<Integer> visited = new HashSet<>();
        int maxComponent = 0;

        for (Integer node : graph.keySet()) {
            int currentComponentSize = traverseGraph(graph, node, visited);
            if (currentComponentSize > maxComponent) {
                maxComponent = currentComponentSize;
            }
        }

        return maxComponent;
    }

    public static int traverseGraph(Map<Integer, List<Integer>> graph, Integer src, HashSet<Integer> visited) {

        int count = 0;

        if (visited.contains(src)) {
            return 0;
        }

        visited.add(src);
        count++;

        for (Integer neighbour : graph.get(src)) {
            count += traverseGraph(graph, neighbour, visited);
        }

        return count;

    }
}
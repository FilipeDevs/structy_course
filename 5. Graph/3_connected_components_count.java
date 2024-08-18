import java.util.Map;
import java.util.List;
import java.util.HashSet;

class Source {

    public static int connectedComponentsCount(Map<Integer, List<Integer>> graph) {

        int count = 0;
        HashSet<Integer> visited = new HashSet<>();

        for (Integer node : graph.keySet()) {
            if (traverseGraph(graph, node, visited)) {
                count++;
            }
        }

        return count;
    }

    public static boolean traverseGraph(Map<Integer, List<Integer>> graph, Integer src, HashSet<Integer> visited) {
        if (visited.contains(src)) {
            return false;
        }

        visited.add(src);

        for (Integer neighbour : graph.get(src)) {
            traverseGraph(graph, neighbour, visited);
        }

        return true;
    }
}
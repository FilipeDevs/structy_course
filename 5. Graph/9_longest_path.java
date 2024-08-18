import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;

class Source {

    public static int longestPath(Map<String, List<String>> graph) {

        HashMap<String, Integer> distance = new HashMap<>();

        for (String node : graph.keySet()) {
            if (graph.get(node).size() == 0) { // terminal node
                distance.put(node, 0);
            }
        }

        for (String node : graph.keySet()) {
            traverseGraph(graph, node, distance);
        }

        return Collections.max(distance.values());
    }

    public static int traverseGraph(Map<String, List<String>> graph, String node, HashMap<String, Integer> distance) {

        if (distance.containsKey(node)) {
            return distance.get(node);
        }

        int maxPath = 0;

        for (String neigbour : graph.get(node)) {
            int attemptMaxPath = traverseGraph(graph, neigbour, distance);
            if (attemptMaxPath > maxPath) {
                maxPath = attemptMaxPath;
            }
        }

        distance.put(node, maxPath + 1);

        return maxPath + 1;
    }

}
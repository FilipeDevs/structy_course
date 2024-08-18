import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class Source {

    public static int semestersRequired(int numCourses, List<List<Integer>> prereqs) {
        HashMap<Integer, List<Integer>> graph = buildGraph(numCourses, prereqs);
        HashMap<Integer, Integer> distance = new HashMap<>(); // node - distance

        for (int node : graph.keySet()) {
            if (graph.get(node).size() == 0) { // terminal node
                distance.put(node, 1); // 1 semester
            }
        }

        for (int node : graph.keySet()) {
            traverseGraph(node, graph, distance);
        }

        return Collections.max(distance.values());
    }

    public static int traverseGraph(int node, HashMap<Integer, List<Integer>> graph,
            HashMap<Integer, Integer> distance) {
        if (distance.containsKey(node)) {
            return distance.get(node);
        }

        int maxPath = 0;

        for (int neighbour : graph.get(node)) {
            int attemptedPath = traverseGraph(neighbour, graph, distance);

            if (attemptedPath > maxPath) {
                maxPath = attemptedPath;
            }
        }

        distance.put(node, maxPath + 1);

        return maxPath + 1;
    }

    public static HashMap<Integer, List<Integer>> buildGraph(int numCourses, List<List<Integer>> prereqs) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for (int node = 0; node < numCourses; node += 1) {
            graph.put(node, new ArrayList<>());
        }

        for (List<Integer> prereq : prereqs) {
            int a = prereq.get(0);
            int b = prereq.get(1);
            graph.get(a).add(b);
        }

        return graph;
    }

}
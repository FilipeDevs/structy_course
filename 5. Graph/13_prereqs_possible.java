import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

class Source {

    public static boolean prereqsPossible(int numCourses, List<List<Integer>> prereqs) {

        HashMap<Integer, List<Integer>> graph = buildGraph(numCourses, prereqs);
        HashSet<Integer> visited = new HashSet<>();
        HashSet<Integer> visiting = new HashSet<>();

        for (int node : graph.keySet()) {
            if (checkCycle(graph, node, visited, visiting)) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkCycle(HashMap<Integer, List<Integer>> graph, int srcNode,
            HashSet<Integer> visited, HashSet<Integer> visiting) {
        if (visited.contains(srcNode)) {
            return false;
        }

        if (visiting.contains(srcNode)) {
            return true; // cycle found so this course is not possible to complete
        }

        visiting.add(srcNode);

        for (int neigbour : graph.get(srcNode)) {
            if (checkCycle(graph, neigbour, visited, visiting)) {
                return true;
            }
        }

        visiting.remove(srcNode);
        visited.add(srcNode);

        return false;
    }

    public static HashMap<Integer, List<Integer>> buildGraph(int numCourses, List<List<Integer>> prereqs) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();

        // Courses have ids ranging from 0 through n - 1
        // Setup nodes in graph
        for (int id = 0; id < numCourses; id++) {
            graph.put(id, new ArrayList<>());
        }

        // Connect the nodes between them
        for (List<Integer> edge : prereqs) {
            int nodeA = edge.get(0);
            int nodeB = edge.get(1);

            graph.get(nodeA).add(nodeB);
        }

        return graph;
    }
}
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

class Source {
  public static boolean rareRouting(int n, List<List<Integer>> roads) {
    HashMap<Integer, List<Integer>> graph = buildGraph(n, roads);
    HashSet<Integer> visited = new HashSet<>();
    boolean valid = validate(graph, 0, visited, -1);
    return valid && visited.size() == n;
  }
  
  public static boolean validate(HashMap<Integer, List<Integer>> graph, int node, HashSet<Integer> visited, int prevNode) {

    // Use of previous node to prevent searching backwards
    if (visited.contains(node)) {
      return false;
    }
    visited.add(node);
    
    for (int neighbor : graph.get(node)) {
      if(neighbor != prevNode && !validate(graph, neighbor, visited, node)) {
        return false;
      }
    }
    return true;
  }
  
  public static HashMap<Integer, List<Integer>> buildGraph(int numNodes, List<List<Integer>> edges)  {
    HashMap<Integer, List<Integer>> graph = new HashMap<>();
    for (int i = 0; i < numNodes; i += 1) {
      graph.put(i, new ArrayList<>());
    }
    
    for (List<Integer> pair : edges) {
      int nodeA = pair.get(0);
      int nodeB = pair.get(1);
      graph.get(nodeA).add(nodeB);
      graph.get(nodeB).add(nodeA);
    }
    return graph;
  }
  
}

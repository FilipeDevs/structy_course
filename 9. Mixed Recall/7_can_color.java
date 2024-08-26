import java.util.Map;
import java.util.HashMap;
import java.util.List;

class Source {
  public static boolean canColor(Map<String, List<String>> graph) {
    HashMap<String, Boolean> coloring = new HashMap<>();
    for (String node : graph.keySet()) {
      if (!coloring.containsKey(node) && !valid(graph, node, coloring, false)) {
        return false; 
      }
    }
    
    return true;
  }
  
  public static boolean valid(Map<String, List<String>> graph, String node, HashMap<String, Boolean> coloring, boolean currentColor) {
    if (coloring.containsKey(node)) {
      return currentColor == coloring.get(node);
    }
    
    coloring.put(node, currentColor);
    
    for (String neighbor : graph.get(node)) {
      if (!valid(graph, neighbor, coloring, !currentColor)) {
        return false;
      }
    }
    
    return true;
  }

}

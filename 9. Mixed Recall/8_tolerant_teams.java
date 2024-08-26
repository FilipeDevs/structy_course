import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

class Source {
  public static boolean tolerantTeams(List<List<String>> rivalries) {
    HashMap<String, Boolean> teams = new HashMap<>();
    HashMap<String, List<String>> graph = buildGraph(rivalries);

    for(String node : graph.keySet()) {
      if(!teams.containsKey(node)) {
        if(!isValid(node, teams, graph, false)) {
          return false;
        }
      } 
    }
    
    return true;
  }

  public static boolean isValid(String node, HashMap<String, Boolean> teams, 
                                HashMap<String, List<String>> graph, boolean currentTeam) {

    if(teams.containsKey(node)) {
      // if conflict (false) it means two rivals are on the same team
      return teams.get(node) == currentTeam; 
    }

    teams.put(node, currentTeam);

    for(String neighbor : graph.get(node)) {
      if(!isValid(neighbor, teams, graph, !currentTeam)) {
        return false;
      }
    }
    
    return true;
  }

  public static HashMap<String, List<String>> buildGraph(List<List<String>> rivalries) {
    HashMap<String, List<String>> graph = new HashMap<>();

    for(List<String> edge : rivalries) {
      String nodeA = edge.get(0);
      String nodeB = edge.get(1);

      if(!graph.containsKey(nodeA)) {
        graph.put(nodeA, new ArrayList<>());
      }

      if(!graph.containsKey(nodeB)) {
        graph.put(nodeB, new ArrayList<>());
      }

      graph.get(nodeA).add(nodeB);
      graph.get(nodeB).add(nodeA);
    }
    
    return graph;
  }

}
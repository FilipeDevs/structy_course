import java.util.List;
import java.util.HashMap;

class Source {
  
  public static int positioningPlants(List<List<Integer>> costs) {
    
    return positioningPlants(costs, 0, -1, new HashMap<>());
  }

  public static int positioningPlants(List<List<Integer>> costs, int pos, 
                                      int prevPlantType, HashMap<List<Integer>, Integer> memo) {
    if(pos >= costs.size()) {
      return 0;
    }

    List<Integer> key = List.of(pos, prevPlantType);
    
    if(memo.containsKey(key)) {
      return memo.get(key);
    }

    List<Integer> plantCosts = costs.get(pos);
    int minCost = -1;
    
    for(int plantIdx = 0; plantIdx < plantCosts.size(); plantIdx++) {
      if(plantIdx != prevPlantType) {
        int cost = plantCosts.get(plantIdx);
        int currentCost = cost + positioningPlants(costs, pos + 1, plantIdx, memo);
        if(minCost == -1 || currentCost < minCost) {
          minCost = currentCost;
        }
      }
    }

    memo.put(key, minCost);
    return minCost;
  }


}

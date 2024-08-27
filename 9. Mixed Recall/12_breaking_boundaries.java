import java.util.List;
import java.util.HashMap;

class Source {

  public static int breakingBoundaries(int m, int n, int k, int r, int c) {

    return breakingBoundaries_(m, n, k, r, c, new HashMap<>());
  }
  
  public static int breakingBoundaries_(int m, int n, int k, 
                                        int r, int c, HashMap<List<Integer>, Integer> memo) {

    if(k == -1) {
      return 0;
    }

    if(r < 0 || r >= m || c < 0 || c >= n) {
      return 1; // out of bounds
    }

    List<Integer> key = List.of(k, r, c);

    if(memo.containsKey(key)) {
      return memo.get(key);
    }

    int count = breakingBoundaries_(m, n, k - 1, r + 1, c, memo) +
      breakingBoundaries_(m, n, k - 1, r - 1, c, memo) +
      breakingBoundaries_(m, n, k - 1, r, c - 1, memo) +
      breakingBoundaries_(m, n, k - 1, r, c + 1, memo);
    
    memo.put(key, count);
    return count;
  }

}

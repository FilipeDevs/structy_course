import java.util.List;
import java.util.HashMap;

class Source {
  public static int maxIncreasingSubseq(List<Integer> numbers) {
    return maxIncreasingSubseq(numbers, 0, -1, new HashMap<>());
  }
  
  public static int maxIncreasingSubseq(List<Integer> numbers, int i, int lastNum, HashMap<List<Integer>, Integer> memo) {
    if (i == numbers.size()) {
      return 0;
    }
    
    List<Integer> key = List.of(i, lastNum);
    if (memo.containsKey(key)) {
      return memo.get(key);
    }
    
    int dontTake = maxIncreasingSubseq(numbers, i + 1, lastNum, memo);
    
    int currentNum = numbers.get(i);
    int take = -1;
    if (currentNum > lastNum) {
      take = 1 + maxIncreasingSubseq(numbers, i + 1, numbers.get(i), memo);
    }
    
    if (dontTake > take) {
      memo.put(key, dontTake);
      return dontTake;
    } else {
      memo.put(key, take);
      return take;
    }
  }

}

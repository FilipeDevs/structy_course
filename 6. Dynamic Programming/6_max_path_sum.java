import java.util.List;
import java.util.HashMap;

class Source {

    public static int maxPathSum(List<List<Integer>> grid) {

        return maxPathSum(0, 0, grid, new HashMap<>());
    }

    public static int maxPathSum(int r, int c, List<List<Integer>> grid, HashMap<List<Integer>, Integer> memo) {

        // check overshoot of boundaries of grid
        if (r == grid.size() || c == grid.get(0).size()) {
            return 0;
        }

        // bottom right corner
        if (r == grid.size() - 1 && c == grid.get(r).size() - 1) {
            return grid.get(r).get(c);
        }

        List<Integer> currentPos = List.of(r, c);
        if (memo.containsKey(currentPos)) {
            return memo.get(currentPos);
        }

        int result = Math.max(maxPathSum(r + 1, c, grid, memo), maxPathSum(r, c + 1, grid, memo)) + grid.get(r).get(c);
        memo.put(currentPos, result);
        return result;
    }
}

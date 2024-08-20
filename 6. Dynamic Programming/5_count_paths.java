import java.util.List;
import java.util.HashMap;

class Source {

    public static int countPaths(List<List<String>> grid) {
        return countPaths(0, 0, grid, new HashMap<>());
    }

    public static int countPaths(int r, int c, List<List<String>> grid, HashMap<List<Integer>, Integer> memo) {

        // Check overshoot
        if (r == grid.size() || c == grid.get(0).size()) {
            return 0;
        }

        if (grid.get(r).get(c).equals("X")) {
            return 0;
        }

        if (r == grid.size() - 1 && c == grid.get(r).size() - 1) { // bottom-right corner
            return 1;
        }

        int possiblePaths = 0;

        if (memo.containsKey(List.of(r, c))) {
            return memo.get(List.of(r, c));
        }

        possiblePaths += countPaths(r, c + 1, grid, memo);
        possiblePaths += countPaths(r + 1, c, grid, memo);

        memo.put(List.of(r, c), possiblePaths);

        return possiblePaths;
    }

}

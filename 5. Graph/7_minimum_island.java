import java.util.List;
import java.util.HashSet;
import java.util.AbstractMap.SimpleEntry;

class Source {

    public static int minimumIsland(List<List<String>> grid) {

        HashSet<SimpleEntry<Integer, Integer>> visited = new HashSet<>();

        int smallestIsland = Integer.MAX_VALUE;

        for (int row = 0; row < grid.size(); row++) {
            for (int col = 0; col < grid.get(row).size(); col++) {

                int islandSize = traverseGrid(grid, visited, row, col);

                if (islandSize < smallestIsland && islandSize > 0) {
                    smallestIsland = islandSize;
                }
            }
        }

        return smallestIsland;
    }

    public static int traverseGrid(List<List<String>> grid, HashSet<SimpleEntry<Integer, Integer>> visited, int row,
            int col) {

        boolean rowInBounds = 0 <= row && row < grid.size();
        boolean colInBounds = 0 <= col && col < grid.get(0).size();

        if (!rowInBounds || !colInBounds) {
            return 0;
        }

        if (grid.get(row).get(col).equals("W")) {
            return 0;
        }

        SimpleEntry<Integer, Integer> currentPos = new SimpleEntry<>(row, col);

        if (visited.contains(currentPos)) {
            return 0;
        }

        visited.add(currentPos);

        int count = 1;

        count += traverseGrid(grid, visited, row + 1, col);
        count += traverseGrid(grid, visited, row - 1, col);
        count += traverseGrid(grid, visited, row, col + 1);
        count += traverseGrid(grid, visited, row, col - 1);

        return count;
    }
}
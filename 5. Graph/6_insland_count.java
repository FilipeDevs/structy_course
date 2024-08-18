import java.util.List;
import java.util.HashSet;
import java.util.AbstractMap.SimpleEntry;

class Source {

    public static int islandCount(List<List<String>> grid) {

        HashSet<SimpleEntry<Integer, Integer>> visitedPos = new HashSet<>();

        int count = 0;

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                if (traverseGrid(grid, visitedPos, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean traverseGrid(List<List<String>> grid, HashSet<SimpleEntry<Integer, Integer>> visitedPos,
            int row, int col) {
        boolean rowInBounds = 0 <= row && row < grid.size();
        boolean colInBounds = 0 <= col && col < grid.get(0).size();

        if (!rowInBounds || !colInBounds) { // Check boundaries before making access to the grid
            return false;
        }

        SimpleEntry<Integer, Integer> currentPos = new SimpleEntry<>(row, col);

        if (visitedPos.contains(currentPos)) { // Already visited this node
            return false;
        }

        visitedPos.add(currentPos);

        if (grid.get(row).get(col).equals("W")) { // Water
            return false;
        }

        traverseGrid(grid, visitedPos, row + 1, col);
        traverseGrid(grid, visitedPos, row - 1, col);
        traverseGrid(grid, visitedPos, row, col + 1);
        traverseGrid(grid, visitedPos, row, col - 1);

        return true;
    }

}
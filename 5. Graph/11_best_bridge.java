import java.util.List;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

class Source {
    public static int bestBridge(List<List<String>> grid) {

        HashSet<List<Integer>> mainIsland = new HashSet<>();

        // Get all the positions of one island
        for (int row = 0; row < grid.size(); row++) {
            for (int col = 0; col < grid.get(row).size(); col++) {
                HashSet<List<Integer>> attemptIslandTraverse = traverseGrid(row, col, grid, new HashSet<>());

                if (attemptIslandTraverse.size() > 0) {
                    mainIsland = attemptIslandTraverse;
                    break;
                }
            }
        }

        Queue<List<Integer>> queue = new LinkedList<>(); // row, col, distance
        HashSet<List<Integer>> visited = new HashSet<>(); // row, col

        // Setup queue
        for (List<Integer> pos : mainIsland) {
            int row = pos.get(0);
            int col = pos.get(1);

            queue.add(List.of(row, col, 0));
            visited.add(pos);
        }

        while (!queue.isEmpty()) {

            List<Integer> current = queue.remove();
            int row = current.get(0);
            int col = current.get(1);
            int distance = current.get(2);

            boolean rowInbounds = 0 <= row && row < grid.size();
            boolean colInbounds = 0 <= col && col < grid.get(0).size();

            if (!rowInbounds || !colInbounds) {
                continue;
            }

            if (grid.get(row).get(col).equals("L") && !mainIsland.contains(List.of(row, col))) { // found another land !
                return distance - 1;
            }

            List<List<Integer>> deltas = List.of(
                    List.of(1, 0),
                    List.of(-1, 0),
                    List.of(0, 1),
                    List.of(0, -1));

            for (List<Integer> delta : deltas) {
                int newRow = row + delta.get(0);
                int newCol = col + delta.get(1);
                List<Integer> newPos = List.of(newRow, newCol);
                if (!visited.contains(newPos)) {
                    visited.add(newPos);
                    queue.add(List.of(newRow, newCol, distance + 1));
                }
            }

        }

        return -1;
    }

    public static HashSet<List<Integer>> traverseGrid(int row, int col, List<List<String>> grid,
            HashSet<List<Integer>> visited) {

        if (visited.contains(List.of(row, col))) {
            return visited;
        }

        boolean rowInbounds = 0 <= row && row < grid.size();
        boolean colInbounds = 0 <= col && col < grid.get(0).size();

        if (!rowInbounds || !colInbounds) {
            return visited;
        }

        if (grid.get(row).get(col).equals("W")) {
            return visited;
        }

        visited.add(List.of(row, col));

        traverseGrid(row + 1, col, grid, visited);
        traverseGrid(row - 1, col, grid, visited);
        traverseGrid(row, col + 1, grid, visited);
        traverseGrid(row, col - 1, grid, visited);

        return visited;
    }

}
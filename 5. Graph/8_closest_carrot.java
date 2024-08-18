import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;

class Source {
    public static int closestCarrot(List<List<String>> grid, int startRow, int startCol) {

        HashSet<SimpleEntry<Integer, Integer>> visitedPos = new HashSet<>();
        Queue<SimpleEntry<SimpleEntry<Integer, Integer>, Integer>> queue = new LinkedList<>(); // (row, col), (level)

        SimpleEntry<SimpleEntry<Integer, Integer>, Integer> current = new SimpleEntry<>(
                new SimpleEntry<>(startRow, startCol), 0);

        queue.add(current);

        while (!queue.isEmpty()) {

            current = queue.remove();

            SimpleEntry<Integer, Integer> currentPos = current.getKey();
            int currentRow = currentPos.getKey();
            int currentCol = currentPos.getValue();
            int level = current.getValue();

            boolean rowInBounds = 0 <= currentRow && currentRow < grid.size();
            boolean colInBounds = 0 <= currentCol && currentCol < grid.get(0).size();

            if (!rowInBounds || !colInBounds) {
                continue;
            }

            if (visitedPos.contains(currentPos)) {
                continue;
            }

            if (grid.get(currentRow).get(currentCol).equals("X")) {
                continue;
            }

            if (grid.get(currentRow).get(currentCol).equals("C")) {
                return level;
            }

            visitedPos.add(currentPos);

            queue.add(new SimpleEntry<>(new SimpleEntry<>(currentRow + 1, currentCol), level + 1));
            queue.add(new SimpleEntry<>(new SimpleEntry<>(currentRow - 1, currentCol), level + 1));
            queue.add(new SimpleEntry<>(new SimpleEntry<>(currentRow, currentCol + 1), level + 1));
            queue.add(new SimpleEntry<>(new SimpleEntry<>(currentRow, currentCol - 1), level + 1));

        }

        return -1;
    }
}
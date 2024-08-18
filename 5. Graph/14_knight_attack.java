import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.List;

class Source {
    public static int knightAttack(int n, int kr, int kc, int pr, int pc) {

        Queue<List<Integer>> queue = new LinkedList<>(); // [row, col, distance]
        HashSet<List<Integer>> visited = new HashSet<>(); // [row, col]

        queue.add(List.of(kr, kc, 0)); // first treat knight pos
        visited.add(List.of(kr, kc));

        while (!queue.isEmpty()) {

            List<Integer> entry = queue.remove();
            int currentRow = entry.get(0);
            int currentCol = entry.get(1);
            int distance = entry.get(2);

            boolean isRowInBounds = 0 <= currentRow && currentRow < n;
            boolean isColInBounds = 0 <= currentCol && currentCol < n;

            if (!isRowInBounds || !isColInBounds) {
                continue;
            }

            if (currentRow == pr && currentCol == pc) { // knight on pawn !
                return distance;
            }

            List<List<Integer>> deltas = List.of(
                    List.of(-2, 1),
                    List.of(-2, -1),
                    List.of(2, 1),
                    List.of(2, -1),
                    List.of(1, -2),
                    List.of(-1, -2),
                    List.of(1, 2),
                    List.of(-1, 2));

            for (List<Integer> delta : deltas) {
                int newRow = delta.get(0) + currentRow;
                int newCol = delta.get(1) + currentCol;

                if (!visited.contains(List.of(newRow, newCol))) {

                    boolean rowBounds = 0 <= newRow && newRow < n;
                    boolean colBounds = 0 <= newCol && newCol < n;

                    if (rowBounds && colBounds) {
                        queue.add(List.of(newRow, newCol, distance + 1));
                        visited.add(List.of(newRow, newCol));
                    }
                }
            }

        }

        return -1;
    }
}
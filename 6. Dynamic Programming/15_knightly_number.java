import java.util.List;
import java.util.HashMap;

class Source {

    public static int knightlyNumber(int n, int m, int kr, int kc, int pr, int pc) {
        // todo
        return knightlyNumber_(n, m, kr, kc, pr, pc, new HashMap<>());
    }

    public static int knightlyNumber_(int n, int m, int kr, int kc,
            int pr, int pc, HashMap<List<Integer>, Integer> memo) {

        if (m == 0) {
            if (kr == pr && kc == pc) { // found pawn and used all moves
                return 1;
            } else { // didn't found pawn and used all moves
                return 0;
            }
        }

        if (kr >= n || kc >= n || kr < 0 || kc < 0) { // out of bounds check
            return 0;
        }

        List<Integer> currentPosAndMoves = List.of(m, kr, kc);

        // memoization, prevent handling of a pos that was already handled before (with
        // x moves)
        if (memo.containsKey(currentPosAndMoves)) {
            return memo.get(currentPosAndMoves);
        }

        List<List<Integer>> deltas = List.of(
                List.of(1, 2),
                List.of(-1, 2),
                List.of(1, -2),
                List.of(-1, -2),
                List.of(2, -1),
                List.of(-2, -1),
                List.of(2, 1),
                List.of(-2, 1));

        int totalPaths = 0;

        for (List<Integer> delta : deltas) {
            int newKr = kr + delta.get(0);
            int newKc = kc + delta.get(1);

            totalPaths += knightlyNumber_(n, m - 1, newKr, newKc, pr, pc, memo);
        }

        memo.put(currentPosAndMoves, totalPaths);

        return totalPaths;
    }

}

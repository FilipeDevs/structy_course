import java.util.List;
import java.util.HashMap;

class Source {

    public static int countingChange(int amount, List<Integer> coins) {

        return countingChange(amount, 0, coins, new HashMap<>());
    }

    public static int countingChange(int amount, int coinIdx, List<Integer> coins,
            HashMap<List<Integer>, Integer> memo) {
        if (amount == 0) {
            return 1;
        }

        if (coinIdx >= coins.size()) {
            return 0;
        }

        List<Integer> subProblem = List.of(amount, coinIdx);
        if (memo.containsKey(subProblem)) {
            return memo.get(subProblem);
        }

        int totalWays = 0;
        int value = coins.get(coinIdx);

        for (int qty = 0; (value * qty) <= amount; qty++) {
            int subAmount = amount - (value * qty);
            totalWays += countingChange(subAmount, coinIdx + 1, coins, memo);
        }

        memo.put(subProblem, totalWays);
        return totalWays;

    }
}

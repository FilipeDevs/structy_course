import java.util.List;
import java.util.HashMap;

class Source {

    public static boolean sumPossible(int amount, List<Integer> numbers) {
        return sumPossible(amount, numbers, new HashMap<>());
    }

    public static boolean sumPossible(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo) {

        if (amount == 0) { // sum is possible
            return true;
        }

        if (amount < 0) { // check possible overshoot to negative values
            return false;
        }

        if (memo.containsKey(amount)) { // this "sub amount" was already handled no need to repeat
            return memo.get(amount);
        }

        for (int num : numbers) {
            int subAmount = amount - num;
            if (sumPossible(subAmount, numbers, memo)) {
                memo.put(amount, true);
                return true;
            }
        }

        memo.put(amount, false);
        return false;
    }

}

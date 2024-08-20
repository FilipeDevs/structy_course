import java.util.List;
import java.util.HashMap;

class Source {
    public static int maxPalinSubsequence(String str) {
        return maxPalinSubsequence(str, 0, str.length() - 1, new HashMap<>());
    }

    public static int maxPalinSubsequence(String str, int i, int j, HashMap<List<Integer>, Integer> memo) {
        if (i > j) {
            return 0;
        }

        if (i == j) {
            return 1;
        }

        List<Integer> key = List.of(i, j);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int result;
        if (str.charAt(i) == str.charAt(j)) {
            result = 2 + maxPalinSubsequence(str, i + 1, j - 1, memo);
        } else {
            result = Math.max(
                    maxPalinSubsequence(str, i + 1, j, memo),
                    maxPalinSubsequence(str, i, j - 1, memo));
        }
        memo.put(key, result);
        return result;
    }

}

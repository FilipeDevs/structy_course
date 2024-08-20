import java.util.HashMap;
import java.util.List;

class Source {

    public static int overlapSubsequence(String str1, String str2) {
        // todo
        return overlapSubsequence_(str1, str2, 0, 0, new HashMap<>());
    }

    public static int overlapSubsequence_(String str1, String str2, int s1, int s2,
            HashMap<List<Integer>, Integer> memo) {

        if (s1 >= str1.length() || s2 >= str2.length()) {
            return 0;
        }

        List<Integer> key = List.of(s1, s2);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        boolean sameFirstChar = str1.charAt(s1) == str2.charAt(s2);
        int overlapLength = 0;

        if (sameFirstChar) { // one char overlaps
            overlapLength += overlapSubsequence_(str1, str2, s1 + 1, s2 + 1, memo) + 1;
        } else {
            overlapLength += Math.max(
                    overlapSubsequence_(str1, str2, s1 + 1, s2, memo),
                    overlapSubsequence_(str1, str2, s1, s2 + 1, memo));
        }

        memo.put(key, overlapLength);

        return overlapLength;
    }

}

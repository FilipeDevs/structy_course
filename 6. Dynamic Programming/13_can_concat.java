import java.util.List;
import java.util.HashMap;

class Source {
    public static boolean canConcat(String s, List<String> words) {
        return canConcat(s, words, new HashMap<>());
    }

    public static boolean canConcat(String s, List<String> words, HashMap<String, Boolean> memo) {
        if (s.length() == 0) {
            return true;
        }

        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        for (String word : words) {
            if (s.startsWith(word)) {
                if (canConcat(s.substring(word.length()), words, memo)) {
                    memo.put(s, true);
                    return true;
                }
            }
        }
        memo.put(s, false);
        return false;
    }

}

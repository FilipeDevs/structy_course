import java.util.List;
import java.util.HashMap;

class Source {

    public static int quickestConcat(String s, List<String> words) {
        double result = quickestConcat(s, words, new HashMap<>());
        if (result == Double.POSITIVE_INFINITY) {
            return -1;
        } else {
            return (int) result;
        }
    }

    public static double quickestConcat(String s, List<String> words, HashMap<String, Double> memo) {
        if (s.length() == 0) {
            return 0;
        }

        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        double min = Double.POSITIVE_INFINITY;
        for (String word : words) {
            if (s.startsWith(word)) {
                String suffix = s.substring(word.length());
                double attempt = 1 + quickestConcat(suffix, words, memo);
                if (attempt < min) {
                    min = attempt;
                }
            }
        }

        memo.put(s, min);
        return min;
    }
}

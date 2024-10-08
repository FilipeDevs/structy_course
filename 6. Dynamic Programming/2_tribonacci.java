import java.util.HashMap;

class Source {

    public static int tribonacci(int n) {
        return tribonacci(n, new HashMap<Integer, Integer>());
    }

    public static int tribonacci(int n, HashMap<Integer, Integer> memo) {

        // Base cases
        if (n == 0 || n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = tribonacci(n - 1, memo) + tribonacci(n - 2, memo) + tribonacci(n - 3, memo);
        memo.put(n, result);
        return result;
    }
}

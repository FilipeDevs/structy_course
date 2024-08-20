import java.util.List;
import java.util.HashMap;

class Source {

    public static int nonAdjacentSum(List<Integer> nums) {
        return nonAdjacentSum(nums, 0, new HashMap<>());
    }

    public static int nonAdjacentSum(List<Integer> nums, int i, HashMap<Integer, Integer> memo) {
        if (i >= nums.size()) {
            return 0;
        }

        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        int result = Math.max(
                nums.get(i) + nonAdjacentSum(nums, i + 2, memo), // take the nearest non adjacent element
                nonAdjacentSum(nums, i + 1, memo) // don't take i so can take the next element
        );

        memo.put(i, result);

        return result;
    }

}

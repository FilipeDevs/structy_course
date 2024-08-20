import java.util.List;
import java.util.HashMap;

class Source {

    public static boolean arrayStepper(List<Integer> nums) {
        return arrayStepper(nums, 0, new HashMap<>());
    }

    public static boolean arrayStepper(List<Integer> nums, int index, HashMap<Integer, Boolean> memo) {

        if (index == nums.size() - 1) {
            return true;
        }

        if (index >= nums.size()) {
            return false;
        }

        if (nums.get(index) == 0) {
            return false;
        }

        if (memo.containsKey(index)) {
            return memo.get(index);
        }

        int value = nums.get(index);

        for (int i = 1; i <= value; i++) {
            if (arrayStepper(nums, index + i, memo)) {
                memo.put(index, true);
                return true;
            }
        }

        memo.put(index, false);
        return false;
    }

}

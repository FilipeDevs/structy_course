import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Source {
    public static List<Integer> pairSum(List<Integer> numbers, int target) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            int newTarget = target - numbers.get(i);

            if (map.containsKey(newTarget)) {
                result = List.of(map.get(newTarget), i);
                break;
            } else {
                map.put(numbers.get(i), i);
            }
        }

        return result;
    }
}

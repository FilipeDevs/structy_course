import java.util.List;
import java.util.HashMap;

class Source {
    public static List<Integer> pairProduct(List<Integer> numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (target % numbers.get(i) == 0) {
                int newTarget = target / numbers.get(i);
                if (map.containsKey(newTarget)) {
                    return List.of(map.get(newTarget), i);
                } else {
                    map.put(numbers.get(i), i);
                }
            }
        }

        return null;
    }
}

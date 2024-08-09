import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Source {
    public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>(listA); // O(n)

        // Same as line 9
        // for(int val : listA) {
        // set.add(val);
        // }

        // O(m)
        for (int val : listB) {
            if (set.contains(val)) { // O(1)
                result.add(val);
            }
        }

        return result;
    }

}
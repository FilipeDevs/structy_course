import java.util.List;
import java.util.Collections;

class Source {
    public static List<Integer> fiveSort(List<Integer> array) {
        int startIndex = 0;
        int endIndex = array.size() - 1;

        while (startIndex < endIndex) {
            if (array.get(endIndex) == 5) {
                // 5 at the right no need to swap move right pointer to left
                endIndex--;
            } else if (array.get(startIndex) != 5) {
                // not a 5 at the left so no need to swap, move left pointer to right
                startIndex++;
            } else {
                Collections.swap(array, startIndex, endIndex);
            }
        }

        return array;
    }
}
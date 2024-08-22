import java.util.List;
import java.util.ArrayList;

class Source {
    public static List<List<String>> subsets(List<String> elements) {

        System.out.println(elements);

        if (elements.size() == 0) {
            return List.of(List.of());
        }

        List<List<String>> allSubsets = new ArrayList<>();

        String ele = elements.get(0);
        List<List<String>> subsetsWithoutEle = subsets(elements.subList(1, elements.size()));

        allSubsets.addAll(subsetsWithoutEle);

        for (List<String> subsetWithout : subsetsWithoutEle) {
            List<String> subsetWith = new ArrayList<>(subsetWithout);
            subsetWith.add(ele);
            allSubsets.add(subsetWith);
        }

        return allSubsets;
    }
}

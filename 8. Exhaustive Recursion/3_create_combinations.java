import java.util.List;
import java.util.ArrayList;

class Source {
    public static List<List<String>> createCombinations(List<String> items, int k) {

        if (k == 0) {
            return List.of(List.of());
        } else if (items.size() == 0) {
            return List.of();
        }

        String ele = items.get(0);
        List<List<String>> allCombos = new ArrayList<>();

        for (List<String> combo : createCombinations(items.subList(1, items.size()), k - 1)) {
            List<String> comboWithEle = new ArrayList<>(combo);
            comboWithEle.add(ele);
            allCombos.add(comboWithEle);
        }

        allCombos.addAll(createCombinations(items.subList(1, items.size()), k));

        return allCombos;
    }

}

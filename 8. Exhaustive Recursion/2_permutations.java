import java.util.List;
import java.util.ArrayList;

class Source {

    public static List<List<String>> permutations(List<String> elements) {

        if (elements.isEmpty()) {
            return List.of(List.of());
        }

        List<List<String>> allPerms = new ArrayList<>();
        String firstEle = elements.get(0);
        List<List<String>> subPerms = permutations(elements.subList(1, elements.size()));

        for (List<String> subPerm : subPerms) {
            // less or equal bcs it needs to be inserted at the end aswell
            for (int i = 0; i <= subPerm.size(); i++) {
                List<String> newSubPerm = new ArrayList<>();
                List<String> left = subPerm.subList(0, i);
                List<String> right = subPerm.subList(i, subPerm.size());

                newSubPerm.addAll(left);
                newSubPerm.add(firstEle);
                newSubPerm.addAll(right);
                allPerms.add(newSubPerm);
            }
        }

        return allPerms;
    }

}

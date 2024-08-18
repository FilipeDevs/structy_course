import java.util.List;
import java.util.ArrayList;

class Node<T> {
    T val;
    Node<T> left;
    Node<T> right;

    public Node(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Source {
    public static List<Double> levelAverages(Node<Integer> root) {

        // Construct the 2D list with all nodes per level
        List<List<Integer>> result = new ArrayList<>();
        fillNodes(root, result, 0); // start at level 0

        // Calculate the average for each level
        List<Double> averageList = new ArrayList<>();

        for (List<Integer> list : result) {
            int sum = 0;
            for (int val : list) {
                sum += val;
            }
            Double average = (double) sum / (double) list.size();
            averageList.add(average);
        }

        return averageList;
    }

    public static void fillNodes(Node<Integer> root, List<List<Integer>> list, int level) {

        if (root == null) {
            return;
        }

        if (level == list.size()) {
            List<Integer> newList = new ArrayList<>();
            newList.add(root.val);
            list.add(newList);
        } else {
            list.get(level).add(root.val);
        }

        fillNodes(root.left, list, level + 1);
        fillNodes(root.right, list, level + 1);

    }

}
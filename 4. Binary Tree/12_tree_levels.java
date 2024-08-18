import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.AbstractMap.SimpleEntry;

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
    public static <T> List<List<T>> treeLevels(Node<T> root) {
        if (root == null) {
            return List.of();
        }

        List<List<T>> levels = new ArrayList<>();
        Queue<SimpleEntry<Node<T>, Integer>> queue = new LinkedList<>();
        queue.add(new SimpleEntry<>(root, 0));
        while (!queue.isEmpty()) {
            SimpleEntry<Node<T>, Integer> pair = queue.remove();
            Node<T> node = pair.getKey();
            int level = pair.getValue();

            if (level == levels.size()) {
                ArrayList<T> newList = new ArrayList<>();
                newList.add(node.val);
                levels.add(newList);
            } else {
                levels.get(level).add(node.val);
            }

            if (node.left != null) {
                queue.add(new SimpleEntry<>(node.left, level + 1));
            }
            if (node.right != null) {
                queue.add(new SimpleEntry<>(node.right, level + 1));
            }
        }

        return levels;
    }
}
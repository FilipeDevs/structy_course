import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

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

    public static <T> List<List<T>> allTreePaths(Node<T> root) {
        List<List<T>> result = _allTreePaths(root);

        for (List<T> list : result) {
            Collections.reverse(list);
        }

        return result;
    }

    public static <T> List<List<T>> _allTreePaths(Node<T> root) {

        if (root == null) {
            return List.of();
        }

        if (root.left == null && root.right == null) {
            List<T> list = new ArrayList<>();
            list.add(root.val);
            return List.of(list);
        }

        List<List<T>> allPaths = new ArrayList<>();

        List<List<T>> leftPaths = _allTreePaths(root.left);

        for (List<T> list : leftPaths) {
            list.add(root.val);
            allPaths.add(list);
        }

        List<List<T>> rightPaths = _allTreePaths(root.right);

        for (List<T> list : rightPaths) {
            list.add(root.val);
            allPaths.add(list);
        }

        return allPaths;
    }
}
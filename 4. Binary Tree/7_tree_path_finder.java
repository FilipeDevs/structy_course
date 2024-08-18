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

    public static <T> List<T> returnPath(Node<T> root, T target) {

        if (root == null) {
            return null;
        }

        if (root.val == target) {
            List<T> list = new ArrayList<>();
            list.add(target);
            return list; // array list is mutable (List is not)
        }

        List<T> leftPath = returnPath(root.left, target);

        if (leftPath != null) {
            leftPath.add(root.val); // bcs it's an arraylist I can add to it
            return leftPath;
        }

        List<T> rightPath = returnPath(root.right, target);

        if (rightPath != null) {
            rightPath.add(root.val); // bcs it's an arraylist I can add to it
            return rightPath;
        }

        return null;

    }

    public static <T> List<T> pathFinder(Node<T> root, T target) {
        List<T> path = returnPath(root, target); // O(n)
        if (path == null) {
            return null;
        } else {
            Collections.reverse(path);
            return path;
        }

    }
}
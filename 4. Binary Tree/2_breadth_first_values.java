import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    public static List<String> breadthFirstValues(Node<String> root) {
        List<String> result = new ArrayList<>();
        Queue<Node<String>> queue = new LinkedList<>();
        Node<String> current = root;

        if (root != null) {
            queue.add(current);
        }

        while (!queue.isEmpty()) {
            current = queue.remove(); // first in -> first out
            result.add(current.val);

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return result;
    }
}

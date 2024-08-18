import java.util.Queue;
import java.util.LinkedList;

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
    public static <T> T bottomRightValue(Node<T> root) {

        Queue<Node<T>> queue = new LinkedList<>();
        Node<T> current = root;

        if (root != null) {
            queue.add(current);
        }

        while (!queue.isEmpty()) {
            current = queue.remove();

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return current.val;
    }
}
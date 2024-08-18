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

    public static boolean treeIncludes(Node<String> root, String target) {

        Queue<Node<String>> queue = new LinkedList<>();
        Node<String> current = root;

        if (root != null) {
            queue.add(current);
        }

        while (!queue.isEmpty()) {
            current = queue.remove();

            if (current.val.equals(target)) {
                return true;
            }

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }

        }

        return false;
    }
}
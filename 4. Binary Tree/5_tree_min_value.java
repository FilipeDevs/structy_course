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
    public static Double treeMinValue(Node<Double> root) {

        double min = Double.MAX_VALUE;
        Queue<Node<Double>> queue = new LinkedList<>();
        Node<Double> current = root;

        if (root != null) {
            queue.add(current);
        }

        while (!queue.isEmpty()) {
            current = queue.remove();

            if (current.val < min) {
                min = current.val;
            }

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return min;
    }
}
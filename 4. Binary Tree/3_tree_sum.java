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
    public static int treeSum(Node<Integer> root) {

        Queue<Node<Integer>> queue = new LinkedList<>();
        Node<Integer> current = root;
        int sum = 0;

        if (root != null) {
            queue.add(current);
        }

        while (!queue.isEmpty()) {
            current = queue.remove();
            sum += current.val;

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return sum;
    }
}
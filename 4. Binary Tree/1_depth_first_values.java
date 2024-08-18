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

    public static void recursivedepthFirst(Node<String> node, List<String> list) {

        if (node == null) {
            return;
        }

        list.add(node.val);

        recursivedepthFirst(node.left, list);
        recursivedepthFirst(node.right, list);

        return;
    }

    public static List<String> depthFirstValues(Node<String> root) {

        List<String> list = new ArrayList<String>();

        recursivedepthFirst(root, list);

        return list;
    }

}

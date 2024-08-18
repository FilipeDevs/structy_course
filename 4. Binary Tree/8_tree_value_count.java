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
    public static <T> int treeValueCount(Node<T> root, T target) {

        if (root == null) {
            return 0;
        }

        int currentOcc = root.val == target ? 1 : 0;

        currentOcc = currentOcc + treeValueCount(root.left, target);
        currentOcc = currentOcc + treeValueCount(root.right, target);

        return currentOcc;
    }

}
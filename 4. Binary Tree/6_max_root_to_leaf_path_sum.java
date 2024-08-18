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
    public static Double maxPathSum(Node<Double> root) {

        if (root == null) {
            return Double.NEGATIVE_INFINITY;
        }

        if (root.left == null && root.right == null) {
            // need this base case bcs if not the node with no childs will just make
            // (root.val + -infinity) and not just root.val
            return root.val;
        }

        return root.val + Math.max(maxPathSum(root.left), maxPathSum(root.right));
    }

}
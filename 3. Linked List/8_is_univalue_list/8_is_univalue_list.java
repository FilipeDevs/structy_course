class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static <T> boolean isUnivalueList(Node<T> head) {

        Node<T> current = head;
        T value = current.val;

        while (current != null) {
            if (current.val != value) {
                return false;
            }
            current = current.next;
        }

        return true;
    }
}

class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static <T> Node<T> removeNode(Node<T> head, T targetVal) {
        if (head.val == targetVal) {
            return head.next;
        }

        Node<T> prev = null;
        Node<T> current = head;

        while (current != null) {
            if (current.val == targetVal) {
                prev.next = current.next;
                break;
            }
            prev = current;
            current = current.next;
        }

        return head;
    }
}
import java.util.List;

class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static <T> Node<T> createLinkedList(List<T> values) {

        if (values.isEmpty()) {
            return null;
        }
        Node<T> head = new Node<>(values.get(0));
        Node<T> current = head;

        for (int i = 1; i < values.size(); i++) {
            current.next = new Node<>(values.get(i));
            current = current.next;
        }

        return head;
    }

}
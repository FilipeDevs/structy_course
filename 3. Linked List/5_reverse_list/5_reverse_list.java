class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static <T> Node<T> reverseList(Node<T> head) {

        Node<T> prev = null;
        Node<T> current = head;

        while (current != null) {
            Node<T> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

}
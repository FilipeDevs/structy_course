class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static <T> boolean linkedListFind(Node<T> head, T target) {

        Node<T> current = head;

        while (current != null) {
            if (current.val == target) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

}
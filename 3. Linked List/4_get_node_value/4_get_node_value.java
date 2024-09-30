class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static <T> T getNodeValue(Node<T> head, int index) {

        Node<T> current = head;

        while (current != null) {
            if (index == 0) {
                return current.val;
            }
            current = current.next;
            index--;
        }

        return null;
    }

}
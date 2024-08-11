class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static int sumList(Node<Integer> head) {

        int sum = 0;
        Node<Integer> current = head;

        while (current != null) {
            sum += current.val;
            current = current.next;
        }

        return sum;
    }

}

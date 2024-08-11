class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {

    public static Node<Integer> addLists(Node<Integer> head1, Node<Integer> head2) {
        return addListsRecursive(head1, head2, 0);
    }

    public static Node<Integer> addListsRecursive(Node<Integer> head1, Node<Integer> head2, int carry) {
        if (head1 == null && head2 == null && carry == 0) {
            return null;
        }

        int value1 = head1 == null ? 0 : head1.val;
        int value2 = head2 == null ? 0 : head2.val;

        int sum = value1 + value2 + carry;
        int digit = sum % 10;

        Node<Integer> newNode = new Node<Integer>(digit);

        int nextCarry = sum >= 10 ? 1 : 0;

        Node<Integer> next1 = head1 == null ? null : head1.next;
        Node<Integer> next2 = head2 == null ? null : head2.next;

        newNode.next = addListsRecursive(next1, next2, nextCarry);

        return newNode;
    }
}
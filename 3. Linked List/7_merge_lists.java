class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2) {
        // Dummy head to "generalise" algorithm
        Node<Integer> dummyHead = new Node<Integer>(null);
        Node<Integer> tail = dummyHead;
        Node<Integer> curr1 = head1;
        Node<Integer> curr2 = head2;

        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                tail.next = curr1;
                curr1 = curr1.next;
            } else {
                tail.next = curr2;
                curr2 = curr2.next;
            }
            tail = tail.next;
        }

        if (curr1 == null) {
            tail.next = curr2;
        }

        if (curr2 == null) {
            tail.next = curr1;
        }

        // Dummy head not part of linked list
        return dummyHead.next;
    }
}
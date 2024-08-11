class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static <T> Node<T> insertNode(Node<T> head, T value, int index) {

        Node<T> newNode = new Node<T>(value);

        // edge case -> insert before head
        if (index == 0) {
            newNode.next = head;
            // new head of linked list
            return newNode;
        }

        int count = 0;
        Node<T> current = head.next;
        Node<T> prev = null;

        while (current != null) {
            count++;
            if (index == count) {
                newNode.next = current;
                prev.next = newNode;
                break;
            }
            prev = current;
            current = current.next;
        }

        // edge case -> insert at the end
        if (index > count) {
            prev.next = newNode;
        }

        return head;
    }
}
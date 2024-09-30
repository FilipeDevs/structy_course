class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static <T> int longestStreak(Node<T> head) {
        Node<T> current = head;
        int maxStreak = 0;
        int currentStreak = 0;
        T prevVal = null;

        while (current != null) {
            if (prevVal == current.val) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }
            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
            }
            prevVal = current.val;
            current = current.next;
        }
        return maxStreak;
    }
}

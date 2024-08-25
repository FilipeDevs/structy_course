import java.util.Set;
import java.util.HashSet;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> boolean linkedListCycle(Node<T> head) {

    Set<Node<T>> nodesVisited = new HashSet<>();

    Node<T> current = head;

    while(current != null) {
      if(nodesVisited.contains(current)) {
        return true;
      }

      nodesVisited.add(current);
      current = current.next;
    }
    
    return false;
  }

}

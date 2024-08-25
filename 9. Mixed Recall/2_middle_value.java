import java.util.List;
import java.util.ArrayList;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> T middleValue(Node<T> head) {

    List<T> values = new ArrayList<>();

    Node<T> current = head;

    while(current != null) {
      values.add(current.val);
      current = current.next;
    }
    
    return values.get(values.size() / 2);
  }

 
}

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> boolean linkedPalindrome(Node<T> head) {

    List<T> elements = new ArrayList<>();

    Node<T> current = head;

    while(current != null) {
      elements.add(current.val);
      current = current.next;
    }
    
    List<T> copy = new ArrayList<>(elements);
    Collections.reverse(copy);
    return elements.equals(copy);
  }


}

import java.util.List;

class Node<T> {
  T val;
  Node<T> left;
  Node<T> right;
  
  public Node(T val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}

class Source {
  public static Node<String> buildTreeInPre(List<String> inOrder, List<String> preOrder) {
    if (inOrder.size() == 0) {
      return null;
    }
    
    String value = preOrder.get(0);
    Node<String> root = new Node<>(value);
    
    int midIdx = inOrder.indexOf(value);
    List<String> leftIn = inOrder.subList(0, midIdx);
    List<String> rightIn = inOrder.subList(midIdx + 1, inOrder.size());
    List<String> leftPre = preOrder.subList(1, leftIn.size() + 1);
    List<String> rightPre = preOrder.subList(leftIn.size() + 1, preOrder.size());
    
    root.left = buildTreeInPre(leftIn, leftPre);
    root.right = buildTreeInPre(rightIn, rightPre);
    return root;
  }

}

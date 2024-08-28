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
  public static Node<String> buildTreeInPost(List<String> inOrder, List<String> postOrder) {
    if (inOrder.size() == 0) {
      return null;
    }
    String value = postOrder.get(postOrder.size() - 1);
    Node<String> root = new Node<>(value);
    
    int midIdx = inOrder.indexOf(value);
    List<String> leftIn = inOrder.subList(0, midIdx);
    List<String> rightIn = inOrder.subList(midIdx + 1, inOrder.size());
  
    List<String> leftPost = postOrder.subList(0, leftIn.size());
    List<String> rightPost = postOrder.subList(leftIn.size(), postOrder.size() - 1);
  
    root.left = buildTreeInPost(leftIn, leftPost);
    root.right = buildTreeInPost(rightIn, rightPost);
    return root;
  }

}

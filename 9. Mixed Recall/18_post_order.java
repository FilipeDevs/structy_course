import java.util.List;
import java.util.ArrayList;

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
  
  public static List<String> postOrder(Node<String> root) {
    List<String> result = new ArrayList<>();
    postOrderTraverseal(root, result);
  
    return result;
  }

  public static void postOrderTraverseal(Node<String> root, List<String> result) {
    if(root == null) {
      return;
    }

    postOrderTraverseal(root.left, result);
    postOrderTraverseal(root.right, result);
    result.add(root.val);
    
  }
}
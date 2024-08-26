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
  public static List<String> leftyNodes(Node<String> root) {
    List<String> values = new ArrayList<>();
    traverse(root, values, 0);
    return values;
  }

  public static void traverse(Node<String> root, List<String> values, int level) {
    if (root == null) {
      return;
    }

    // means we just got to this "level" of the tree
    // since the left node is searched first we know the most lefty node will be searched first
    // in this level
    if (level == values.size()) { 
      values.add(root.val);
    }
    
    traverse(root.left, values, level + 1);
    traverse(root.right, values, level + 1);
  }
  
}

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

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
  public static String lowestCommonAncestor(Node<String> root, String val1, String val2) {
    List<String> path1 = findPath(root, val1);
    List<String> path2 = findPath(root, val2);
    HashSet<String> set2 = new HashSet<>(path2);
    for (String val : path1) {
      if (set2.contains(val)) {
        return val;
      }
    }
    return null;
  }
  
  public static List<String> findPath(Node<String> root, String targetVal) {
    if (root == null) {
      return null;
    }
    
    if (root.val == targetVal) {
      List<String> newList = new ArrayList<>();
      newList.add(root.val);
      return newList;
    }
    
    List<String> leftPath = findPath(root.left, targetVal);
    if (leftPath != null) {
      leftPath.add(root.val);
      return leftPath;
    }
    
    List<String> rightPath = findPath(root.right, targetVal);
    if (rightPath != null) {
      rightPath.add(root.val);
      return rightPath;
    }
    
    return null;
  }

}

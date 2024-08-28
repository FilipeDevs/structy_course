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
    public static boolean binarySearchTreeIncludes(Node<Integer> root, int target) {
  
      if(root == null) {
        return false;
      }
  
      if(target < root.val) {
        return binarySearchTreeIncludes(root.left, target);
      } else if(target > root.val) {
        return binarySearchTreeIncludes(root.right, target);
      } else {
        return true;
      }
  
    }
}
  
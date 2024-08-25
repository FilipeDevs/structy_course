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
  
  public static Node<String> flipTree(Node<String> root) {
    flipTree_(root);
    return root;
  }

  public static void flipTree_(Node<String> root) {
    
    if(root == null) {
      return;
    }

    Node<String> tempNode = root.left;

    root.left = root.right;
    root.right = tempNode;

    flipTree_(root.left);
    flipTree_(root.right);
    
    return;
  }

}
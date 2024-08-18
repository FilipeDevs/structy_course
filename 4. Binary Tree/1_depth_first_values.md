Write a method, depthFirstValues, that takes in the root of a binary tree. The method should return a List containing all values of the tree in depth-first order.

_test_00_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");
Node<String> e = new Node<>("e");
Node<String> f = new Node<>("f");

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;

//      a
//    /   \
//   b     c
//  / \     \
// d   e     f

Source.depthFirstValues(a);
//    -> ["a", "b", "d", "e", "c", "f"]
```

_test_01_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");
Node<String> e = new Node<>("e");
Node<String> f = new Node<>("f");
Node<String> g = new Node<>("g");

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;
e.left = g;

//      a
//    /   \
//   b     c
//  / \     \
// d   e     f
//    /
//   g

Source.depthFirstValues(a);
//    -> ["a", "b", "d", "e", "g", "c", "f"]
```

_test_02_

```java
Node<String> a = new Node<>("a");
//      a
Source.depthFirstValues(a);
//    -> ["a"]
```

_test_03_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");
Node<String> e = new Node<>("e");

a.right = b;
b.left = c;
c.right = d;
d.right = e;

//      a
//       \
//        b
//       /
//      c
//       \
//        d
//         \
//          e

Source.depthFirstValues(a);
//    -> ["a", "b", "c", "d", "e"]
```

_test_04_

```java
Source.depthFirstValues(null);
//    -> []
```

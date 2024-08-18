Write a method, pathFinder, that takes in the root of a binary tree and a target value. The method should return an array representing a path to the target value. If the target value is not found in the tree, then return null.

You may assume that the tree contains unique values.

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

Source.pathFinder(a, "e"); // -> [ "a", "b", "e" ]
```

_test_01_

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

Source.pathFinder(a, "p"); // -> null
```

_test_02_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");
Node<String> e = new Node<>("e");
Node<String> f = new Node<>("f");
Node<String> g = new Node<>("g");
Node<String> h = new Node<>("h");

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;
e.left = g;
f.right = h;

//      a
//    /   \
//   b     c
//  / \     \
// d   e     f
//    /       \
//   g         h

Source.pathFinder(a, "c"); // -> ["a", "c"]
```

_test_03_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");
Node<String> e = new Node<>("e");
Node<String> f = new Node<>("f");
Node<String> g = new Node<>("g");
Node<String> h = new Node<>("h");

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;
e.left = g;
f.right = h;

//      a
//    /   \
//   b     c
//  / \     \
// d   e     f
//    /       \
//   g         h

Source.pathFinder(a, "h"); // -> ["a", "c", "f", "h"]
```

_test_04_

```java
Node<String> x = new Node<>("x");

//      x

Source.pathFinder(x, "x"); // -> ["x"]
```

_test_05_

```java
Source.pathFinder(null, "x"); // -> null
```

Write a method, leafList, that takes in the root of a binary tree and returns a list containing the values of all leaf nodes in left-to-right order.

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

Source.leafList(a); // -> [ "d", "e", "f" ]
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

Source.leafList(a); // -> [ "d", "g", "h" ]
```

_test_02_

```java
Node<Integer> a = new Node<>(5);
Node<Integer> b = new Node<>(11);
Node<Integer> c = new Node<>(54);
Node<Integer> d = new Node<>(20);
Node<Integer> e = new Node<>(15);
Node<Integer> f = new Node<>(1);
Node<Integer> g = new Node<>(3);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
e.left = f;
e.right = g;

//        5
//     /    \
//    11    54
//  /   \
// 20   15
//      / \
//     1  3

Source.leafList(a); // -> [ 20, 1, 3, 54 ]
```

_test_03_

```java
Node<String> x = new Node<>("x");

//      x

Source.leafList(x); // -> [ "x" ]
```

_test_04_

```java
Source.leafList(null); // -> [ ]
```

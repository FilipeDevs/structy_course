Write a method, treeSum, that takes in the root of a binary tree that contains number values. The method should return the total sum of all values in the tree.

_test_00_

```java
Node<Integer> a = new Node<>(3);
Node<Integer> b = new Node<>(11);
Node<Integer> c = new Node<>(4);
Node<Integer> d = new Node<>(4);
Node<Integer> e = new Node<>(-2);
Node<Integer> f = new Node<>(1);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;

//       3
//    /    \
//   11     4
//  / \      \
// 4   -2     1

Source.treeSum(a); // -> 21
```

_test_01_

```java
Node<Integer> a = new Node<>(1);
Node<Integer> b = new Node<>(6);
Node<Integer> c = new Node<>(0);
Node<Integer> d = new Node<>(3);
Node<Integer> e = new Node<>(-6);
Node<Integer> f = new Node<>(2);
Node<Integer> g = new Node<>(2);
Node<Integer> h = new Node<>(2);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;
e.left = g;
f.right = h;

//      1
//    /   \
//   6     0
//  / \     \
// 3   -6    2
//    /       \
//   2         2

Source.treeSum(a); // -> 10
```

_test_02_

```java
Source.treeSum(null); // -> 0
```

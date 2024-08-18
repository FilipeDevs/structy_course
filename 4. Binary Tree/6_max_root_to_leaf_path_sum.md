Write a method, maxPathSum, that takes in the root of a binary tree that contains number values. The method should return the maximum sum of any root to leaf path within the tree.

You may assume that the input tree is non-empty.

_test_00_

```java
Node<Double> a = new Node<>(3.);
Node<Double> b = new Node<>(11.);
Node<Double> c = new Node<>(4.);
Node<Double> d = new Node<>(4.);
Node<Double> e = new Node<>(-2.);
Node<Double> f = new Node<>(1.);

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

Source.maxPathSum(a); // -> 18
```

_test_01_

```java
Node<Double> a = new Node<>(5.);
Node<Double> b = new Node<>(11.);
Node<Double> c = new Node<>(54.);
Node<Double> d = new Node<>(20.);
Node<Double> e = new Node<>(15.);
Node<Double> f = new Node<>(1.);
Node<Double> g = new Node<>(3.);

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

Source.maxPathSum(a); // -> 59
```

_test_02_

```java
Node<Double> a = new Node<>(-1.);
Node<Double> b = new Node<>(-6.);
Node<Double> c = new Node<>(-5.);
Node<Double> d = new Node<>(-3.);
Node<Double> e = new Node<>(0.);
Node<Double> f = new Node<>(-13.);
Node<Double> g = new Node<>(-1.);
Node<Double> h = new Node<>(-2.);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;
e.left = g;
f.right = h;

//        -1
//      /   \
//    -6    -5
//   /  \     \
// -3   0    -13
//     /       \
//    -1       -2

Source.maxPathSum(a); // -> -8
```

_test_03_

```java
Node<Double> a = new Node<>(42.);

//        42

Source.maxPathSum(a); // -> 42
```

Write a method, treeMinValue, that takes in the root of a binary tree that contains number values. The method should return the minimum value within the tree.

You may assume that the input tree is non-empt

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

Source.treeMinValue(a); // -> -2
```

_test_01_

```java
Node<Double> a = new Node<>(5.);
Node<Double> b = new Node<>(11.);
Node<Double> c = new Node<>(3.);
Node<Double> d = new Node<>(4.);
Node<Double> e = new Node<>(14.);
Node<Double> f = new Node<>(12.);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;

//       5
//    /    \
//   11     3
//  / \      \
// 4   14     12

Source.treeMinValue(a); // -> 3
```

_test_02_

```java
Node<Double> a = new Node<>(-1.);
Node<Double> b = new Node<>(-6.);
Node<Double> c = new Node<>(-5.);
Node<Double> d = new Node<>(-3.);
Node<Double> e = new Node<>(-4.);
Node<Double> f = new Node<>(-13.);
Node<Double> g = new Node<>(-2.);
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
// -3   -4   -13
//     /       \
//    -2       -2

Source.treeMinValue(a); // -> -13
```

_test_03_

```java
Node<Double> a = new Node<>(42.);

//        42

Source.treeMinValue(a); // -> 42
```

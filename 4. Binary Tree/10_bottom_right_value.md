Write a method, bottomRightValue, that takes in the root of a binary tree. The method should return the right-most value in the bottom-most level of the tree.

You may assume that the input tree is non-empty.

_test_00_

```java
Node<Integer> a = new Node<>(3);
Node<Integer> b = new Node<>(11);
Node<Integer> c = new Node<>(10);
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
//   11     10
//  / \      \
// 4   -2     1

Source.bottomRightValue(a); // -> 1
```

_test_01_

```java
Node<Integer> a = new Node<>(-1);
Node<Integer> b = new Node<>(-6);
Node<Integer> c = new Node<>(-5);
Node<Integer> d = new Node<>(-3);
Node<Integer> e = new Node<>(-4);
Node<Integer> f = new Node<>(-13);
Node<Integer> g = new Node<>(-2);
Node<Integer> h = new Node<>(6);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;
e.left = g;
e.right = h;

//        -1
//      /   \
//    -6    -5
//   /  \     \
// -3   -4   -13
//     / \
//    -2  6

Source.bottomRightValue(a); // -> 6
```

_test_02_

```java
Node<Integer> a = new Node<>(-1);
Node<Integer> b = new Node<>(-6);
Node<Integer> c = new Node<>(-5);
Node<Integer> d = new Node<>(-3);
Node<Integer> e = new Node<>(-4);
Node<Integer> f = new Node<>(-13);
Node<Integer> g = new Node<>(-2);
Node<Integer> h = new Node<>(6);
Node<Integer> i = new Node<>(7);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;
e.left = g;
e.right = h;
f.left = i;

//        -1
//      /   \
//    -6    -5
//   /  \     \
// -3   -4   -13
//     / \    /
//    -2  6  7

Source.bottomRightValue(a); // -> 7
```

_test_03_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");
Node<String> e = new Node<>("e");
Node<String> f = new Node<>("f");

a.left = b;
a.right = c;
b.right = d;
d.left = e;
e.right = f;

//      a
//    /   \
//   b     c
//    \
//     d
//    /
//   e
//   \
//    f

Source.bottomRightValue(a); // -> "f"
```

_test_04_

```java
Node<Integer> a = new Node<>(42);

//      42

Source.bottomRightValue(a); // -> 42
```

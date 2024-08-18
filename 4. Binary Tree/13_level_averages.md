Write a method, levelAverages, that takes in the root of a binary tree that contains number values. The method should return a list containing the average value of each level.

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

Source.levelAverages(a); // -> [ 3., 7.5, 1. ]
```

_test_01_

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

Source.levelAverages(a); // -> [ 5., 32.5, 17.5, 2. ]
```

_test_02_

```java
Node<Integer> a = new Node<>(-1);
Node<Integer> b = new Node<>(-6);
Node<Integer> c = new Node<>(-5);
Node<Integer> d = new Node<>(-3);
Node<Integer> e = new Node<>(0);
Node<Integer> f = new Node<>(45);
Node<Integer> g = new Node<>(-1);
Node<Integer> h = new Node<>(-2);

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
// -3   0     45
//     /       \
//    -1       -2

Source.levelAverages(a); // -> [ -1., -5.5, 14., -1.5 ]
```

_test_03_

```java
Node<Integer> q = new Node<>(13);
Node<Integer> r = new Node<>(4);
Node<Integer> s = new Node<>(2);
Node<Integer> t = new Node<>(9);
Node<Integer> u = new Node<>(2);
Node<Integer> v = new Node<>(42);

q.left = r;
q.right = s;
r.right = t;
t.left = u;
u.right = v;

//        13
//      /   \
//     4     2
//      \
//       9
//      /
//     2
//    /
//   42

Source.levelAverages(q); // -> [ 13., 3., 9., 2., 42. ]
```

_test_04_

```java
Source.levelAverages(null); // -> [ ]
```

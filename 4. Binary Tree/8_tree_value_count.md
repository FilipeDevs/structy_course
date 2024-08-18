Write a method, treeValueCount, that takes in the root of a binary tree and a target value. The method should return the number of times that the target occurs in the tree.

_test_00_

```java
Node<Integer> a = new Node<>(12);
Node<Integer> b = new Node<>(6);
Node<Integer> c = new Node<>(6);
Node<Integer> d = new Node<>(4);
Node<Integer> e = new Node<>(6);
Node<Integer> f = new Node<>(12);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;

//      12
//    /   \
//   6     6
//  / \     \
// 4   6     12

Source.treeValueCount(a,  6); // -> 3

```

_test_01_

```java
Node<Integer> a = new Node<>(12);
Node<Integer> b = new Node<>(6);
Node<Integer> c = new Node<>(6);
Node<Integer> d = new Node<>(4);
Node<Integer> e = new Node<>(6);
Node<Integer> f = new Node<>(12);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;

//      12
//    /   \
//   6     6
//  / \     \
// 4  6     12

Source.treeValueCount(a,  12); // -> 2
```

_test_02_

```java
Node<Integer> a = new Node<>(7);
Node<Integer> b = new Node<>(5);
Node<Integer> c = new Node<>(1);
Node<Integer> d = new Node<>(1);
Node<Integer> e = new Node<>(8);
Node<Integer> f = new Node<>(7);
Node<Integer> g = new Node<>(1);
Node<Integer> h = new Node<>(1);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;
e.left = g;
f.right = h;

//      7
//    /   \
//   5     1
//  / \     \
// 1   8     7
//    /       \
//   1         1
Source.treeValueCount(a, 1); // -> 4
```

_test_03_

```java
Node<Integer> a = new Node<>(7);
Node<Integer> b = new Node<>(5);
Node<Integer> c = new Node<>(1);
Node<Integer> d = new Node<>(1);
Node<Integer> e = new Node<>(8);
Node<Integer> f = new Node<>(7);
Node<Integer> g = new Node<>(1);
Node<Integer> h = new Node<>(1);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;
e.left = g;
f.right = h;

//      7
//    /   \
//   5     1
//  / \     \
// 1   8     7
//    /       \
//   1         1

Source.treeValueCount(a, 9); // -> 0
```

_test_04_

```java
Source.treeValueCount(null, 42); // -> 0
```

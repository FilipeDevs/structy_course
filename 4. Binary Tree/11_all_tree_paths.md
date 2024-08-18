Write a method, allTreePaths, that takes in the root of a binary tree. The method should return a 2-Dimensional list where each sublist represents a root-to-leaf path in the tree.

The order within an individual path must start at the root and end at the leaf, but the relative order among paths in the outer list does not matter.

You may assume that the input tree is non-empty.

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

Source.allTreePaths(a); // ->
// [
//   [ 'a', 'b', 'd' ],
//   [ 'a', 'b', 'e' ],
//   [ 'a', 'c', 'f' ]
// ]
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
Node<String> i = new Node<>("i");

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;
e.left = g;
e.right = h;
f.left = i;

//         a
//      /    \
//     b      c
//   /  \      \
//  d    e      f
//      / \    /
//     g  h   i

Source.allTreePaths(a); // ->
// [
//   [ 'a', 'b', 'd' ],
//   [ 'a', 'b', 'e', 'g' ],
//   [ 'a', 'b', 'e', 'h' ],
//   [ 'a', 'c', 'f', 'i' ]
// ]
```

_test_02_

```java
Node<String> q = new Node<>("q");
Node<String> r = new Node<>("r");
Node<String> s = new Node<>("s");
Node<String> t = new Node<>("t");
Node<String> u = new Node<>("u");
Node<String> v = new Node<>("v");

q.left = r;
q.right = s;
r.right = t;
t.left = u;
u.right = v;

//      q
//    /   \
//   r     s
//    \
//     t
//    /
//   u
//  /
// v

Source.allTreePaths(q); // ->
// [
//   [ 'q', 'r', 't', 'u', 'v' ],
//   [ 'q', 's' ]
// ]
```

_test_03_

```java
Node<String> z = new Node<>("z");

//      z

Source.allTreePaths(z); // ->
// [
//   ['z']
// ]
```

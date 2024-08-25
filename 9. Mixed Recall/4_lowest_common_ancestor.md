Write a method, lowestCommonAncestor, that takes in the root of a binary tree and two values. The method should return the value of the lowest common ancestor of the two values in the tree.

You may assume that the tree values are unique and the tree is non-empty.

Note that a node may be considered an ancestor of itself.

Example tree 1

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
e.right = h;

//      a
//    /    \
//   b      c
//  / \      \
// d   e      f
//    / \
//    g  h
```

_test_00_

```java
Source.lowestCommonAncestor(a, "d", "h"); // b
```

_test_01_

```java
Source.lowestCommonAncestor(a, "d", "g"); // b
```

_test_02_

```java
Source.lowestCommonAncestor(a, "g", "c"); // a
```

_test_03_

```java
Source.lowestCommonAncestor(a, "b", "g"); // b
```

_test_04_

```java
Source.lowestCommonAncestor(a, "f", "c"); // c
```

Example tree 2

```java
Node<String> l = new Node<>("l");
Node<String> m = new Node<>("m");
Node<String> n = new Node<>("n");
Node<String> o = new Node<>("o");
Node<String> p = new Node<>("p");
Node<String> q = new Node<>("q");
Node<String> r = new Node<>("r");
Node<String> s = new Node<>("s");
Node<String> t = new Node<>("t");

l.left = m;
l.right = n;
n.left = o;
n.right = p;
o.left = q;
o.right = r;
p.left = s;
p.right = t;

//        l
//     /     \
//    m       n
//         /    \
//         o     p
//        / \   / \
//       q   r s   t
```


_test_05_

```java
Source.lowestCommonAncestor(l, "r", "p"); // n
```

_test_06_

```java
Source.lowestCommonAncestor(l, "m", "o"); // l
```

_test_07_

```java
Source.lowestCommonAncestor(l, "t", "q"); // n
```
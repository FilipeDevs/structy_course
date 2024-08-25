Write a method, flipTree, that takes in the root of a binary tree. The method should flip the binary tree, turning left subtrees into right subtrees and vice-versa. This flipping should occur in-place by modifying the original tree. The method should return the root of the tree.

_test_00_

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

Source.flipTree(a); 

//       a
//    /    \
//   c      b
//  /     /   \
// f     e    d
//     /  \
//    h    g
```

_test_01_

```java
Node<String> u = new Node<>("u");
Node<String> t = new Node<>("t");
Node<String> s = new Node<>("s");
Node<String> r = new Node<>("r");
Node<String> q = new Node<>("q");
Node<String> p = new Node<>("p");

u.left = t;
u.right = s;
s.right = r;
r.left = q;
r.right = p;

//     u
//  /    \
// t      s
//         \
//         r
//        / \
//        q  p

Source.flipTree(u);

//           u
//        /    \
//       s      t
//      /
//     r
//    / \
//   p  q
```

_test_02_

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

Source.flipTree(l);

//             l
//         /      \
//        n        m
//      /  \
//    p     o
//  / \    / \
// t   s  r   q
```

_test_03_

```java
Node<String> n = new Node<>("n");
Node<String> y = new Node<>("y");
Node<String> c = new Node<>("c");

n.left = y;
n.right = c;

//       n
//     /   \
//    y     c

Source.flipTree(n);

//       n
//     /   \
//    c     y
```

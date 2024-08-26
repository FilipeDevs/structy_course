
Write a method, leftyNodes, that takes in the root of a binary tree. The method should return a list containing the left-most value on every level of the tree. The list must be ordered in a top-down fashion where the root is the first element.

Note that the left-most node on a level may not necessarily be a left child.

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

Source.leftyNodes(a); // [ "a", "b", "d", "g" ]
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

Source.leftyNodes(u); // [ "u", "t", "r", "q" ]
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

Source.leftyNodes(l); // [ "l", "m", "o", "q" ]
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

Source.leftyNodes(n); // [ "n", "y" ]
```

_test_04_

```java
Node<String> i = new Node<>("i");
Node<String> n = new Node<>("n");
Node<String> s = new Node<>("s");
Node<String> t = new Node<>("t");

i.right = n;
n.left = s;
n.right = t;

//       i
//        \
//         n
//        / \
//       s   t

Source.leftyNodes(i); // [ "i", "n", "s" ]
```


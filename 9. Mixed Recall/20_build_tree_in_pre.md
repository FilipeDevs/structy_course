Write a method, buildTreeInPre, that takes in an array of in-ordered values and an array of pre-ordered values for a binary tree. The method should build a binary tree that has the given in-order and pre-order traversal structure. The method should return the root of this tree.

You can assume that the values of inorder and preorder are unique.


_test_00_

```java
Source.buildTreeInPre(
  List.of("z", "y", "x"),
  List.of("y", "z", "x") 
);
//       y
//    /    \
//   z      x
```

_test_01_

```java
Source.buildTreeInPre(
  List.of("y", "z", "x"),
  List.of("y", "x", "z") 
);
//       y
//        \
//         x
//        / 
//       z
```

_test_02_

```java
Source.buildTreeInPre(
  List.of("d", "b", "g", "e", "h", "a", "c", "f"),
  List.of("a", "b", "d", "e", "g", "h", "c", "f") 
);
//       a
//    /    \
//   b      c
//  / \      \
// d   e      f
//    / \
//    g  h
```

_test_03_

```java
Source.buildTreeInPre(
  List.of("t", "u", "s", "q", "r", "p"),
  List.of("u", "t", "s", "r", "q", "p") 
);
//     u
//  /    \
// t      s
//         \
//         r
//        / \
//        q  p
```

_test_04_

```java
Source.buildTreeInPre(
  List.of("m", "l", "q", "o", "r", "n", "s", "p", "t"),
  List.of("l", "m", "n", "o", "q", "r", "p", "s", "t") 
);
//        l
//     /     \
//    m       n
//         /    \
//         o     p
//        / \   / \
//       q   r s   t
```

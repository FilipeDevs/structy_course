Write a method, reverseList, that takes in the head of a linked list as an argument. The method should reverse the order of the nodes in the linked list in-place and return the new head of the reversed linked list.

_test_00_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");
Node<String> e = new Node<>("e");
Node<String> f = new Node<>("f");

a.next = b;
b.next = c;
c.next = d;
d.next = e;
e.next = f;

// a -> b -> c -> d -> e -> f

reverseList(a); // f -> e -> d -> c -> b -> a
```

_test_01_

```java
Node<String> x = new Node<>("x");
Node<String> y = new Node<>("y");

x.next = y;

// x -> y

reverseList(x); // y -> x
```

_test_02_

```java
Node<String> p = new Node<>("p");

// p

reverseList(p); // p
```

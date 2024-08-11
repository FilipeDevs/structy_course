Write a method, mergeLists, that takes in the head of two sorted linked lists as arguments. The method should merge the two lists together into single sorted linked list. The method should return the head of the merged linked list.

Do this in-place, by mutating the original Nodes.

You may assume that both input lists are non-empty and contain increasing sorted numbers.

_test_00_

```java
Node<Integer> a = new Node<>(5);
Node<Integer> b = new Node<>(7);
Node<Integer> c = new Node<>(10);
Node<Integer> d = new Node<>(12);
Node<Integer> e = new Node<>(20);
Node<Integer> f = new Node<>(28);
a.next = b;
b.next = c;
c.next = d;
d.next = e;
e.next = f;
// 5 -> 7 -> 10 -> 12 -> 20 -> 28

Node<Integer> q = new Node<>(6);
Node<Integer> r = new Node<>(8);
Node<Integer> s = new Node<>(9);
Node<Integer> t = new Node<>(25);
q.next = r;
r.next = s;
s.next = t;
// 6 -> 8 -> 9 -> 25

Source.mergeLists(a, q);
// 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 12 -> 20 -> 25 -> 28
```

_test_01_

```java
Node<Integer> a = new Node<>(5);
Node<Integer> b = new Node<>(7);
Node<Integer> c = new Node<>(10);
Node<Integer> d = new Node<>(12);
Node<Integer> e = new Node<>(20);
Node<Integer> f = new Node<>(28);
a.next = b;
b.next = c;
c.next = d;
d.next = e;
e.next = f;
// 5 -> 7 -> 10 -> 12 -> 20 -> 28

Node<Integer> q = new Node<>(1);
Node<Integer> r = new Node<>(8);
Node<Integer> s = new Node<>(9);
Node<Integer> t = new Node<>(10);
q.next = r;
r.next = s;
s.next = t;
// 1 -> 8 -> 9 -> 10

Source.mergeLists(a, q);
// 1 -> 5 -> 7 -> 8 -> 9 -> 10 -> 10 -> 12 -> 20 -> 28
```

_test_02_

```java
Node<Integer> h = new Node<>(30);
// 30

Node<Integer> p = new Node<>(15);
Node<Integer> q = new Node<>(67);
p.next = q;
// 15 -> 67

Source.mergeLists(h, p);
// 15 -> 30 -> 67
```

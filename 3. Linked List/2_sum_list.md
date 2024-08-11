Write a method, sumList, that takes in the head of a linked list containing integers as an argument. The method should return the total sum of all values in the linked list.

_test_00_

```java
Node<Integer> a = new Node<>(2);
Node<Integer> b = new Node<>(8);
Node<Integer> c = new Node<>(3);
Node<Integer> d = new Node<>(-1);
Node<Integer> e = new Node<>(7);

a.next = b;
b.next = c;
c.next = d;
d.next = e;

// 2 -> 8 -> 3 -> -1 -> 7

Source.sumList(a); // 19
```

_test_01_

```java
Node<Integer> x = new Node<>(38);
Node<Integer> y = new Node<>(4);

x.next = y;

// 38 -> 4

Source.sumList(x); // 42
```

_test_02_

```java
Node<Integer> z = new Node<>(100);

// 100

Source.sumList(z); // 100
```

_test_03_

```java
Source.sumList(null); // 0
```

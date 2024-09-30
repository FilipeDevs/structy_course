Write a method, linkedListValues, that takes in the head of a linked list as an argument. The method should return an List containing all values of the nodes in the linked list.

_test_00_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");
a.next = b;
b.next = c;
c.next = d;

// a -> b -> c -> d

Source.linkedListValues(a);
// -> [ "a", "b", "c", "d" ]
```

_test_01_

```java
Node<String> x = new Node<>("x");
Node<String> y = new Node<>("y");

x.next = y;

// x -> y

Source.linkedListValues(x);
// -> [ "x", "y" ]
```

_test_02_

```java
Node<String> q = new Node<>("q");

// q

Source.linkedListValues(q);
// -> [ "q" ]
```

_test_03_

```java
Source.linkedListValues(null);
// -> [ ]
```

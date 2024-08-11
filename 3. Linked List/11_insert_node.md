Write a method, insertNode, that takes in the head of a linked list, a value, and an index. The method should insert a new node with the value into the list at the specified index. Consider the head of the linked list as index 0. The method should return the head of the resulting linked list.

Do this in-place.

You may assume that the input list is non-empty and the index is not greater than the length of the input list

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

Source.insertNode(a, "x", 2);
// a -> b -> x -> c -> d
```

_test_01_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");

a.next = b;
b.next = c;
c.next = d;

// a -> b -> c -> d

Source.insertNode(a, "v", 3);
// a -> b -> c -> v -> d
```

_test_02_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");

a.next = b;
b.next = c;
c.next = d;

// a -> b -> c -> d

Source.insertNode(a, "m", 4);
// a -> b -> c -> d -> m
```

_test_03_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");

a.next = b;

// a -> b

Source.insertNode(a, "z", 0);
// z -> a -> b
```

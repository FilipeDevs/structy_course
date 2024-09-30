Write a method, getNodeValue, that takes in the head of a linked list and an index. The method should return the value of the linked list at the specified index.

If there is no node at the given index, then return null.

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

Source.getNodeValue(a, 2); // "c"
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

Source.getNodeValue(a, 3); // "d"
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

Source.getNodeValue(a, 7); // null
```

_test_03_

```java
Node<String> node1 = new Node<>("banana");
Node<String> node2 = new Node<>("mango");

node1.next = node2;

// banana -> mango

Source.getNodeValue(node1, 0); // "banana"
```

_test_04_

```java
Node<String> node1 = new Node<>("banana");
Node<String> node2 = new Node<>("mango");

node1.next = node2;

// banana -> mango

Source.getNodeValue(node1, 1); // "mango"
```

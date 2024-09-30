Write a method, linkedListFind, that takes in the head of a linked list and a target value. The method should return a boolean indicating whether or not the linked list contains the target

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

Source.linkedListFind(a, "c"); // true
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

Source.linkedListFind(a, "d"); // true
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

Source.linkedListFind(a, "q"); // false
```

_test_03_

```java
Node<String> node1 = new Node<>("jason");
Node<String> node2 = new Node<>("leneli");

node1.next = node2;

// jason -> leneli

Source.linkedListFind(node1, "jason"); // true
```

_test_04_

```java
Node<Integer> node1 = new Node<>(42);

// 42

Source.linkedListFind(node1, 42); // true
```

_test_05_

```java
Node<Integer> node1 = new Node<>(42);

// 42

Source.linkedListFind(node1, 100); // false
```

Write a method, createLinkedList, that takes in a list of values as an argument. The method should create a linked list containing each element of the list as the values of the nodes. The method should return the head of the linked list.

_test_00_

```java

Source.createLinkedList(List.of("h", "e", "y"));
// h -> e -> y
```

_test_01_

```java
Source.createLinkedList(List.of(1, 7, 1, 8));
// 1 -> 7 -> 1 -> 8
```

_test_02_

```java
Source.createLinkedList(List.of("a"));
// a
```

_test_03_

```java
Source.createLinkedList(List.of());
// null
```

_test_04_

```java
Node<String> node1 = new Node<>("banana");
Node<String> node2 = new Node<>("mango");

node1.next = node2;

// banana -> mango

Source.getNodeValue(node1, 1); // "mango"
```

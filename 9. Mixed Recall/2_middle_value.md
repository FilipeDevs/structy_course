Write a method, middleValue, that takes in the head of a linked list as an argument. The method should return the value of the middle node in the linked list. If the linked list has an even number of nodes, then return the value of the second middle node.

You may assume that the input list is non-empty.

_test_00_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");
Node<String> e = new Node<>("e");

a.next = b;
b.next = c;
c.next = d;
d.next = e;

// a -> b -> c -> d -> e
Source.middleValue(a); // c
```

_test_01_

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
Source.middleValue(a); // d
```

_test_02_

```java
Node<String> x = new Node<>("x");
Node<String> y = new Node<>("y");
Node<String> z = new Node<>("z");

x.next = y;
y.next = z;

// x -> y -> z
Source.middleValue(x); // y
```

_test_03_

```java
Node<String> x = new Node<>("x");
Node<String> y = new Node<>("y");

x.next = y;

// x -> y 
Source.middleValue(x); // y
```

_test_04_

```java
Node<String> q = new Node<>("q");

// q
Source.middleValue(q); // q
```


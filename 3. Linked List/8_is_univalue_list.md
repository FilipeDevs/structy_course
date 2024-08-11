Write a method, isUnivalueList, that takes in the head of a linked list as an argument. The method should return a boolean indicating whether or not the linked list contains exactly one unique value.

You may assume that the input list is non-empty.

_test_00_

```java
Node<Integer> a = new Node<>(7);
Node<Integer> b = new Node<>(7);
Node<Integer> c = new Node<>(7);

a.next = b;
b.next = c;

// 7 -> 7 -> 7

Source.isUnivalueList(a); // true
```

_test_01_

```java
Node<Integer> a = new Node<>(7);
Node<Integer> b = new Node<>(7);
Node<Integer> c = new Node<>(4);

a.next = b;
b.next = c;

// 7 -> 7 -> 4

Source.isUnivalueList(a); // false
```

_test_02_

```java
Node<Integer> u = new Node<>(2);
Node<Integer> v = new Node<>(2);
Node<Integer> w = new Node<>(2);
Node<Integer> x = new Node<>(2);
Node<Integer> y = new Node<>(2);

u.next = v;
v.next = w;
w.next = x;
x.next = y;

// 2 -> 2 -> 2 -> 2 -> 2

Source.isUnivalueList(u); // true
```

_test_03_

```java
Node<Integer> u = new Node<>(2);
Node<Integer> v = new Node<>(2);
Node<Integer> w = new Node<>(3);
Node<Integer> x = new Node<>(3);
Node<Integer> y = new Node<>(2);

u.next = v;
v.next = w;
w.next = x;
x.next = y;

// 2 -> 2 -> 3 -> 3 -> 2

Source.isUnivalueList(u); // false
```

_test_04_

```java
Node<String> z = new Node<>("z");

// z

Source.isUnivalueList(z); // true
```

_test_05_

```java
Node<Integer> u = new Node<>(2);
Node<Integer> v = new Node<>(1);
Node<Integer> w = new Node<>(2);
Node<Integer> x = new Node<>(2);
Node<Integer> y = new Node<>(2);

u.next = v;
v.next = w;
w.next = x;
x.next = y;

// 2 -> 1 -> 2 -> 2 -> 2

Source.isUnivalueList(u); // false
```

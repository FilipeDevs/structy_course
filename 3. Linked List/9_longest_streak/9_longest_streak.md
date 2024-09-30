Write a method, longestStreak, that takes in the head of a linked list as an argument. The method should return the length of the longest consecutive streak of the same value within the list.

_test_00_

```java
Node<Integer> a = new Node<>(5);
Node<Integer> b = new Node<>(5);
Node<Integer> c = new Node<>(7);
Node<Integer> d = new Node<>(7);
Node<Integer> e = new Node<>(7);
Node<Integer> f = new Node<>(6);

a.next = b;
b.next = c;
c.next = d;
d.next = e;
e.next = f;

// 5 -> 5 -> 7 -> 7 -> 7 -> 6

Source.longestStreak(a); // 3
```

_test_01_

```java
Node<Integer> a = new Node<>(3);
Node<Integer> b = new Node<>(3);
Node<Integer> c = new Node<>(3);
Node<Integer> d = new Node<>(3);
Node<Integer> e = new Node<>(9);
Node<Integer> f = new Node<>(9);

a.next = b;
b.next = c;
c.next = d;
d.next = e;
e.next = f;

// 3 -> 3 -> 3 -> 3 -> 9 -> 9

Source.longestStreak(a); // 4
```

_test_02_

```java
Node<Integer> a = new Node<>(9);
Node<Integer> b = new Node<>(9);
Node<Integer> c = new Node<>(1);
Node<Integer> d = new Node<>(9);
Node<Integer> e = new Node<>(9);
Node<Integer> f = new Node<>(9);

a.next = b;
b.next = c;
c.next = d;
d.next = e;
e.next = f;

// 9 -> 9 -> 1 -> 9 -> 9 -> 9

Source.longestStreak(a); // 3
```

_test_03_

```java
Node<Integer> a = new Node<>(5);
Node<Integer> b = new Node<>(5);

a.next = b;

// 5 -> 5

Source.longestStreak(a); // 2
```

_test_04_

```java
Node<Integer> a = new Node<>(4);

// 4

Source.longestStreak(a); // 1
```

_test_05_

```java
Source.longestStreak(null); // 0
```

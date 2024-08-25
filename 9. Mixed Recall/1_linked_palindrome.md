Write a method, linkedPalindrome, that takes in the head of a linked list as an argument. The method should return a boolean indicating whether or not the linked list is a palindrome. A palindrome is a sequence that is the same both forwards and backwards.

_test_00_

```java
Node<Integer> a = new Node<>(3);
Node<Integer> b = new Node<>(2);
Node<Integer> c = new Node<>(7);
Node<Integer> d = new Node<>(7);
Node<Integer> e = new Node<>(2);
Node<Integer> f = new Node<>(3);

a.next = b;
b.next = c;
c.next = d;
d.next = e;
e.next = f;

// 3 -> 2 -> 7 -> 7 -> 2 -> 3
Source.linkedPalindrome(a); // true
```

_test_01_

```java
Node<Integer> a = new Node<>(3);
Node<Integer> b = new Node<>(2);
Node<Integer> c = new Node<>(4);

a.next = b;
b.next = c;

// 3 -> 2 -> 4
Source.linkedPalindrome(a); // false
```

_test_02_

```java
Node<Integer> a = new Node<>(3);
Node<Integer> b = new Node<>(2);
Node<Integer> c = new Node<>(3);

a.next = b;
b.next = c;

// 3 -> 2 -> 3
Source.linkedPalindrome(a); // true
```

_test_03_

```java
Node<Integer> a = new Node<>(0);
Node<Integer> b = new Node<>(1);
Node<Integer> c = new Node<>(0);
Node<Integer> d = new Node<>(1);
Node<Integer> e = new Node<>(0);

a.next = b;
b.next = c;
c.next = d;
d.next = e;

// 0 -> 1 -> 0 -> 1 -> 0
Source.linkedPalindrome(a); // true
```

_test_04_

```java
Node<Integer> a = new Node<>(0);
Node<Integer> b = new Node<>(1);
Node<Integer> c = new Node<>(0);
Node<Integer> d = new Node<>(1);
Node<Integer> e = new Node<>(1);

a.next = b;
b.next = c;
c.next = d;
d.next = e;

// 0 -> 1 -> 0 -> 1 -> 1
Source.linkedPalindrome(a); // false
```

_test_05_

```java
Node<Integer> a = new Node<>(5);

// 5
Source.linkedPalindrome(a); // true
```

_test_06_

```java
Source.linkedPalindrome(null); // true
```

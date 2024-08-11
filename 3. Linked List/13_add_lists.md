Write a method, addLists, that takes in the head of two linked lists, each representing a number. The nodes of the linked lists contain digits as values. The nodes in the input lists are reversed; this means that the least significant digit of the number is the head. The method should return the head of a new linked listed representing the sum of the input lists. The output list should have its digits reversed as well.

You must do this by traversing through the linked lists once.

```
Say we wanted to compute 621 + 354 normally. The sum is 975:

   621
 + 354
 -----
   975

Then, the reversed linked list format of this problem would appear as:

    1 -> 2 -> 6
 +  4 -> 5 -> 3
 --------------
    5 -> 7 -> 9
```

_test_00_

```java
//   621
// + 354
// -----
//   975

Node<Integer> a1 = new Node<>(1);
Node<Integer> a2 = new Node<>(2);
Node<Integer> a3 = new Node<>(6);
a1.next = a2;
a2.next = a3;
// 1 -> 2 -> 6

Node<Integer> b1 = new Node<>(4);
Node<Integer> b2 = new Node<>(5);
Node<Integer> b3 = new Node<>(3);
b1.next = b2;
b2.next = b3;
// 4 -> 5 -> 3

Source.addLists(a1, b1);
// 5 -> 7 -> 9
```

_test_01_

```java
//  7541
// +  32
// -----
//  7573

Node<Integer> a1 = new Node<>(1);
Node<Integer> a2 = new Node<>(4);
Node<Integer> a3 = new Node<>(5);
Node<Integer> a4 = new Node<>(7);
a1.next = a2;
a2.next = a3;
a3.next = a4;
// 1 -> 4 -> 5 -> 7

Node<Integer> b1 = new Node<>(2);
Node<Integer> b2 = new Node<>(3);
b1.next = b2;
// 2 -> 3

Source.addLists(a1, b1);
// 3 -> 7 -> 5 -> 7
```

_test_02_

```java
//   39
// + 47
// ----
//   86

Node<Integer> a1 = new Node<>(9);
Node<Integer> a2 = new Node<>(3);
a1.next = a2;
// 9 -> 3

Node<Integer> b1 = new Node<>(7);
Node<Integer> b2 = new Node<>(4);
b1.next = b2;
// 7 -> 4

Source.addLists(a1, b1);
// 6 -> 8
```

_test_03_

```java
//   89
// + 47
// ----
//  136

Node<Integer> a1 = new Node<>(9);
Node<Integer> a2 = new Node<>(8);
a1.next = a2;
// 9 -> 8

Node<Integer> b1 = new Node<>(7);
Node<Integer> b2 = new Node<>(4);
b1.next = b2;
// 7 -> 4

Source.addLists(a1, b1);
// 6 -> 3 -> 1
```

_test_04_

```java
//   999
//  +  6
//  ----
//  1005

Node<Integer> a1 = new Node<>(9);
Node<Integer> a2 = new Node<>(9);
Node<Integer> a3 = new Node<>(9);
a1.next = a2;
a2.next = a3;
// 9 -> 9 -> 9

Node<Integer> b1 = new Node<>(6);
// 6

Source.addLists(a1, b1);
// 5 -> 0 -> 0 -> 1
```

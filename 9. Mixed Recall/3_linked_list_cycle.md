Write a method, linkedListCycle, that takes in the head of a linked list as an argument. The method should return a boolean indicating whether or not the linked list contains a cycle.

_test_00_

```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");

a.next = b;
b.next = c;
c.next = d;
d.next = b; // cycle

//         _______
//       /        \
// a -> b -> c -> d 

Source.linkedListCycle(a);  // true
```

_test_01_

```java
Node<String> q = new Node<>("q");
Node<String> r = new Node<>("r");
Node<String> s = new Node<>("s");
Node<String> t = new Node<>("t");
Node<String> u = new Node<>("u");

q.next = r;
r.next = s;
s.next = t;
t.next = u;
u.next = q; // cycle

//    ________________
//  /                 \
// q -> r -> s -> t -> u 

Source.linkedListCycle(q);  // true
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

Source.linkedListCycle(a);  // false
```

_test_03_

```java
Node<String> q = new Node<>("q");
Node<String> r = new Node<>("r");
Node<String> s = new Node<>("s");
Node<String> t = new Node<>("t");
Node<String> u = new Node<>("u");

q.next = r;
r.next = s;
s.next = t;
t.next = u;
u.next = t; // cycle

//                   __
//                 /   \
// q -> r -> s -> t -> u 

Source.linkedListCycle(q);  // true
```

_test_04_

```java
Node<String> p = new Node<>("p");

// p

Source.linkedListCycle(p); // false
```

_test_05_

```java
Source.linkedListCycle(null); // false
```


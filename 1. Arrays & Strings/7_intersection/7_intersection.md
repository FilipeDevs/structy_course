Write a method, intersection, that takes in two Lists, a,b, as arguments. The method should return a new List containing elements that are in both of the two Lists.

You may assume that each input List does not contain duplicate elements.

_test_00_

```java
List<Integer> a = List.of(4,2,1,6);
List<Integer> b = List.of(3,6,9,2,10);
Source.intersection(a, b) // -> [2,6]
```

_test_01_

```java
List<Integer> a = List.of(2,4,6);
List<Integer> b = List.of(4,2);
Source.intersection(a, b) // -> [2,4]
```

_test_02_

```java
List<Integer> a = List.of(4,2,1);
List<Integer> b = List.of(1,2,4,6);
Source.intersection(a, b) // -> [1,2,4]
```

_test_03_

```java
List<Integer> a = List.of(0,1,2);
List<Integer> b = List.of(10,11);
Source.intersection(a, b) // -> []
```

_test_04_

```java
List<Integer> a = new ArrayList<>();
List<Integer> b = new ArrayList<>();

for (int i = 0; i < 60000; i += 1) {
  a.add(i);
  b.add(i);
}
Source.intersection(a, b) // -> [0,1,2,3,..., 49999]
```

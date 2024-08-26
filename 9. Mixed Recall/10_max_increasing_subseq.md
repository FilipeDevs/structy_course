Write a method, maxIncreasingSubseq, that takes in a list of numbers as an argument. The method should return the length of the longest subsequence of strictly increasing numbers.

A subsequence of a list can be created by deleting any elements of the list, while maintaining the relative order of elements.

_test_00_

```java
List<Integer> numbers = List.of(4, 18, 20, 10, 12, 15, 19);
Source.maxIncreasingSubseq(numbers); // -> 5
```

_test_01_

```java
List<Integer> numbers = List.of(12, 9, 2, 5, 4, 32, 90, 20);
Source.maxIncreasingSubseq(numbers); // -> 4
```

_test_02_

```java
List<Integer> numbers = List.of(42, 50, 51, 60, 55, 70, 4, 5, 70);
Source.maxIncreasingSubseq(numbers); // -> 5
```

_test_03_

```java
List<Integer> numbers = List.of(7, 14, 10, 12);
Source.maxIncreasingSubseq(numbers); // -> 3
```

_test_04_

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
Source.maxIncreasingSubseq(numbers); // -> 21
```

_test_05_

```java
List<Integer> numbers = List.of(
  1, 2, 3, 4, 5, 12, 6, 30, 7, 8, 9, 10, 11, 12, 13, 10, 18, 14, 15, 16, 17, 18, 19, 20, 21, 100,
  104
);
Source.maxIncreasingSubseq(numbers); // -> 23
```

_test_06_

```java
List<Integer> numbers = List.of(
  1, 2, 300, 3, 4, 305, 5, 12, 6, 30, 7, 8, 9, 10, 10, 10, 15, 11, 12, 13, 10, 18, 14, 15, 16,
  17, 18, 19, 20, 21, 100,101 ,102, 103, 104, 105
);
Source.maxIncreasingSubseq(numbers); // -> 27
```

_test_07_

```java
List<Integer> numbers = List.of(
  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
  1, 1, 1, 1, 1, 1, 1, 1, 1
);
Source.maxIncreasingSubseq(numbers); // -> 1
```


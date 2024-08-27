Write a method, binarySearch, that takes in a sorted list of numbers and a target. The method should return the index where the target can be found within the list. If the target is not found in the list, then return -1.

You may assume that the input list contains unique numbers sorted in increasing order.

Your method must implement the binary search algorithm.

```
Given these costs,

costs = [
  [4, 3, 7],
  [6, 1, 9],
  [2, 5, 3]
]

The costs of plants at position 1 are $6, $1, and $9.
The cost of planting flower type 0 at position 1 is $6.
The cost of planting flower type 2 at position 1 is $9.
```

The method should return the minimum cost of planting flowers without placing the same flower type in adjacent positions.

_test_00_

```java
Source.binarySearch(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8), 6); // -> 6
```

_test_01_

```java
Source.binarySearch(List.of(0, 6, 8, 12, 16, 19, 20, 24, 28), 27); // -> -1
```

_test_02_

```java
Source.binarySearch(List.of(0, 6, 8, 12, 16, 19, 20, 28), 8); // -> 2
```

_test_03_

```java
Source.binarySearch(List.of(0, 6, 8, 12, 16, 19, 20, 24, 28), 28); // -> 8
```

_test_04_

```java
Source.binarySearch(List.of(7, 9), 7); // -> 0
```

_test_05_

```java
Source.binarySearch(List.of(7, 9), 9); // -> 1
```

_test_06_

```java
Source.binarySearch(List.of(7, 9), 12); // -> -1
```



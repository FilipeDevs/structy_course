Write a method, connectedComponentsCount, that takes in the adjacency list of an undirected graph. The method should return the number of connected components within the graph.

_test_00_

```java
Source.connectedComponentsCount(Map.of(
  0, List.of(8, 1, 5),
  1, List.of(0),
  5, List.of(0, 8),
  8, List.of(0, 5),
  2, List.of(3, 4),
  3, List.of(2, 4),
  4, List.of(3, 2)
)); // -> 2
```

_test_01_

```java
Source.connectedComponentsCount(Map.of(
  1, List.of(2),
  2, List.of(1,8),
  6, List.of(7),
  9, List.of(8),
  7, List.of(6, 8),
  8, List.of(9, 7, 2)
)); // -> 1
```

_test_02_

```java
Source.connectedComponentsCount(Map.of(
  3, List.of(),
  4, List.of(6),
  6, List.of(4, 5, 7, 8),
  8, List.of(6),
  7, List.of(6),
  5, List.of(6),
  1, List.of(2),
  2, List.of(1)
)); // -> 3
```

_test_03_

```java
Source.connectedComponentsCount(Map.of()); // -> 0
```

_test_04_

```java
Source.connectedComponentsCount(Map.of(
  0, List.of(4,7),
  1, List.of(),
  2, List.of(),
  3, List.of(6),
  4, List.of(0),
  6, List.of(3),
  7, List.of(0),
  8, List.of()
)); // -> 5
```

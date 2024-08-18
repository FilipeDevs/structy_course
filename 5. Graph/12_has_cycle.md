Write a method, hasCycle, that takes in a Map representing the adjacency list of a directed graph. The method should return a boolean indicating whether or not the graph contains a cycle.

_test_00_

```java
Source.hasCycle(Map.of(
  "a", List.of("b"),
  "b", List.of("c"),
  "c", List.of("a")
)); // -> true
```

_test_01_

```java
Source.hasCycle(Map.of(
  "a", List.of("b", "c"),
  "b", List.of("c"),
  "c", List.of("d"),
  "d", List.of()
)); // -> false
```

_test_02_

```java
Source.hasCycle(Map.of(
  "a", List.of("b", "c"),
  "b", List.of(),
  "c", List.of(),
  "e", List.of("f"),
  "f", List.of("e")
)); // -> true
```

_test_03_

```java
Source.hasCycle(Map.of(
  "q", List.of("r", "s"),
  "r", List.of("t", "u"),
  "s", List.of(),
  "t", List.of(),
  "u", List.of(),
  "v", List.of("w"),
  "w", List.of(),
  "x", List.of("w")
)); // -> false
```

_test_04_

```java
Source.hasCycle(Map.of(
  "a", List.of("b"),
  "b", List.of("c"),
  "c", List.of("a"),
  "g", List.of()
)); // -> true
```

_test_05_

```java
Source.hasCycle(Map.of(
  "a", List.of("b"),
  "b", List.of("c"),
  "c", List.of("d"),
  "d", List.of("b")
)); // -> true
```

_test_06_

```java
Source.hasCycle(Map.of(
  "a", List.of("b", "c"),
  "b", List.of("c"),
  "c", List.of("d"),
  "d", List.of(),
  "e", List.of("c")
)); // -> false
```

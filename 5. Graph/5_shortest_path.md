Write a method, shortestPath, that takes in a list of edges for an undirected graph and two nodes (nodeA, nodeB). The method should return the length of the shortest path between A and B. Consider the length as the number of edges in the path, not the number of nodes. If there is no path between A and B, then return -1. You can assume that A and B exist as nodes in the graph.

_test_00_

```java
List<List<String>> edges = List.of(
  List.of("w", "x"),
  List.of("x", "y"),
  List.of("z", "y"),
  List.of("z", "v"),
  List.of("w", "v")
);

Source.shortestPath(edges, "w", "z"); // -> 2
```

_test_01_

```java
List<List<String>> edges = List.of(
  List.of("w", "x"),
  List.of("x", "y"),
  List.of("z", "y"),
  List.of("z", "v"),
  List.of("w", "v")
);

Source.shortestPath(edges, "y", "x"); // -> 1
```

_test_02_

```java
List<List<String>> edges = List.of(
  List.of("a", "c"),
  List.of("a", "b"),
  List.of("c", "b"),
  List.of("c", "d"),
  List.of("b", "d"),
  List.of("e", "d"),
  List.of("g", "f")
);

Source.shortestPath(edges, "a", "e"); // -> 3
```

_test_03_

```java
List<List<String>> edges = List.of(
  List.of("a", "c"),
  List.of("a", "b"),
  List.of("c", "b"),
  List.of("c", "d"),
  List.of("b", "d"),
  List.of("e", "d"),
  List.of("g", "f")
);

Source.shortestPath(edges, "e", "c"); // -> 2
```

_test_04_

```java
List<List<String>> edges = List.of(
  List.of("a", "c"),
  List.of("a", "b"),
  List.of("c", "b"),
  List.of("c", "d"),
  List.of("b", "d"),
  List.of("e", "d"),
  List.of("g", "f")
);

Source.shortestPath(edges, "b", "g"); // -> -1
```

_test_05_

```java
List<List<String>> edges = List.of(
  List.of("c", "n"),
  List.of("c", "e"),
  List.of("c", "s"),
  List.of("c", "w"),
  List.of("w", "e")
);

Source.shortestPath(edges, "w", "e"); // -> 1
```

_test_06_

```java
List<List<String>> edges = List.of(
  List.of("c", "n"),
  List.of("c", "e"),
  List.of("c", "s"),
  List.of("c", "w"),
  List.of("w", "e")
);

Source.shortestPath(edges, "n", "e"); // -> 2
```

_test_07_

```java
List<List<String>> edges = List.of(
  List.of("m", "n"),
  List.of("n", "o"),
  List.of("o", "p"),
  List.of("p", "q"),
  List.of("t", "o"),
  List.of("r", "q"),
  List.of("r", "s")
);

Source.shortestPath(edges, "m", "s"); // -> 6
```

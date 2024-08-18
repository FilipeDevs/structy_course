Write a method, undirectedPath, that takes in a list of edges for an undirected graph and two nodes (nodeA, nodeB). The method should return a boolean indicating whether or not there exists a path between nodeA and nodeB.

_test_00_

```java
 List<List<String>> edges = List.of(
  List.of("i", "j"),
  List.of("k", "i"),
  List.of("m", "k"),
  List.of("k", "l"),
  List.of("o", "n")
);

Source.undirectedPath(edges, "j", "m"); // -> true
```

_test_01_

```java
 List<List<String>> edges = List.of(
  List.of("i", "j"),
  List.of("k", "i"),
  List.of("m", "k"),
  List.of("k", "l"),
  List.of("o", "n")
);

Source.undirectedPath(edges, "m", "j"); // -> true
```

_test_02_

```java
 List<List<String>> edges = List.of(
  List.of("i", "j"),
  List.of("k", "i"),
  List.of("m", "k"),
  List.of("k", "l"),
  List.of("o", "n")
);

Source.undirectedPath(edges, "l", "j"); // -> true
```

_test_03_

```java
 List<List<String>> edges = List.of(
  List.of("i", "j"),
  List.of("k", "i"),
  List.of("m", "k"),
  List.of("k", "l"),
  List.of("o", "n")
);

Source.undirectedPath(edges, "k", "o"); // -> false
```

_test_04_

```java
 List<List<String>> edges = List.of(
  List.of("i", "j"),
  List.of("k", "i"),
  List.of("m", "k"),
  List.of("k", "l"),
  List.of("o", "n")
);

Source.undirectedPath(edges, "i", "o"); // -> false
```

_test_05_

```java
 List<List<String>> edges = List.of(
  List.of("b", "a"),
  List.of("c", "a"),
  List.of("b", "c"),
  List.of("q", "r"),
  List.of("q", "s"),
  List.of("q", "u"),
  List.of("q", "t"),
);


Source.undirectedPath(edges, "a", "b"); // -> true
```

_test_06_

```java
 List<List<String>> edges = List.of(
  List.of("b", "a"),
  List.of("c", "a"),
  List.of("b", "c"),
  List.of("q", "r"),
  List.of("q", "s"),
  List.of("q", "u"),
  List.of("q", "t"),
);

Source.undirectedPath(edges, "a", "c"); // -> true
```

_test_07_

```java
 List<List<String>> edges = List.of(
  List.of("b", "a"),
  List.of("c", "a"),
  List.of("b", "c"),
  List.of("q", "r"),
  List.of("q", "s"),
  List.of("q", "u"),
  List.of("q", "t"),
);

Source.undirectedPath(edges, "r", "t"); // -> true
```

_test_08_

```java
 List<List<String>> edges = List.of(
  List.of("b", "a"),
  List.of("c", "a"),
  List.of("b", "c"),
  List.of("q", "r"),
  List.of("q", "s"),
  List.of("q", "u"),
  List.of("q", "t"),
);

Source.undirectedPath(edges, "r", "b"); // -> false
```

_test_09_

```java
 List<List<String>> edges = List.of(
  List.of("s", "r"),
  List.of("t", "q"),
  List.of("q", "r"),
);

Source.undirectedPath(edges, "r", "t"); // -> true
```

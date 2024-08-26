Write a method, canColor, that takes in an map representing the adjacency list of an undirected graph. The method should return a boolean indicating whether or not it is possible to color nodes of the graph using two colors in such a way that adjacent nodes are always different colors.

```
For example, given this graph:

x-y-z

It is possible to color the nodes by using red for x and z, 
then use blue for y. So the answer is true.

For example, given this graph:

    q
   / \
  s - r

It is not possible to color the nodes without making two 
adjacent nodes the same color. So the answer is false.
```


_test_00_

```java
Source.canColor(Map.of(
  "x", List.of("y"),
  "y", List.of("x","z"),
  "z", List.of("y")
)); // -> true
```

_test_01_

```java
Source.canColor(Map.of(
  "q", List.of("r", "s"),
  "r", List.of("q", "s"),
  "s", List.of("r", "q")
)); // -> false
```

_test_02_

```java
Source.canColor(Map.of(
  "a", List.of("b", "c", "d"),
  "b", List.of("a"),
  "c", List.of("a"),
  "d", List.of("a")
)); // -> true
```

_test_03_

```java
Source.canColor(Map.of(
  "a", List.of("b", "c", "d"),
  "b", List.of("a"),
  "c", List.of("a", "d"),
  "d", List.of("a", "c")
)); // -> false
```

_test_04_

```java
Source.canColor(Map.of(
  "h", List.of("i", "k"),
  "i", List.of("h", "j"),
  "j", List.of("i", "k"),
  "k", List.of("h", "j")
)); // -> true
```

_test_05_

```java
Source.canColor(Map.of(
  "z", List.of()
)); // -> true
```

_test_06_

```java
Source.canColor(Map.of(
  "h", List.of("i", "k"),
  "i", List.of("h", "j"),
  "j", List.of("i", "k"),
  "k", List.of("h", "j"),
  "q", List.of("r", "s"),
  "r", List.of("q", "s"),
  "s", List.of("r", "q")
)); // -> false
```

_test_07_

```java
Source.canColor(Map.of(
  "a", List.of("b", "d"), 
  "c", List.of("b", "f"), 
  "b", List.of("a", "c"), 
  "d", List.of("a", "e"), 
  "e", List.of("d", "f"), 
  "f", List.of("e", "c")
)); // -> true
```

_test_08_

```java
Source.canColor(Map.of(
  "a", List.of("b"), 
  "d", List.of("c"), 
  "b", List.of("a", "c"), 
  "c", List.of("b", "d")
)); // -> true
```



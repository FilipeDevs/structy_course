Write a method, closestCarrot, that takes in a grid, a starting row, and a starting column. In the grid, "X"s are walls, "O"s are open spaces, and "C"s are carrots. The method should return a number representing the length of the shortest path from the starting position to a carrot. You may move up, down, left, or right, but cannot pass through walls (X). If there is no possible path to a carrot, then return -1.

_test_00_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "O", "O", "O"),
  List.of("O", "X", "O", "O", "O"),
  List.of("O", "X", "X", "O", "O"),
  List.of("O", "X", "C", "O", "O"),
  List.of("O", "X", "X", "O", "O"),
  List.of("C", "O", "O", "O", "O")
);

Source.closestCarrot(grid, 1, 2); // -> 4
```

_test_01_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "O", "O", "O"),
  List.of("O", "X", "O", "O", "O"),
  List.of("O", "X", "X", "O", "O"),
  List.of("O", "X", "C", "O", "O"),
  List.of("O", "X", "X", "O", "O"),
  List.of("C", "O", "O", "O", "O")
);

Source.closestCarrot(grid, 0, 0); // -> 5
```

_test_02_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "X", "X", "X"),
  List.of("O", "X", "X", "X", "C"),
  List.of("O", "X", "O", "X", "X"),
  List.of("O", "O", "O", "O", "O"),
  List.of("O", "X", "X", "X", "X"),
  List.of("O", "O", "O", "O", "O"),
  List.of("O", "O", "C", "O", "O"),
  List.of("O", "O", "O", "O", "O")
);

Source.closestCarrot(grid, 3, 4); // -> 9
```

_test_03_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "X", "O", "O"),
  List.of("O", "X", "X", "X", "O"),
  List.of("O", "X", "C", "C", "O")
);

Source.closestCarrot(grid, 1, 4); // -> 2
```

_test_04_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "X", "O", "O"),
  List.of("O", "X", "X", "X", "O"),
  List.of("O", "X", "C", "C", "O")
);

Source.closestCarrot(grid, 2, 0); // -> -1
```

_test_05_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "X", "X"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "X", "C")
);

Source.closestCarrot(grid, 0, 0); // -> -1
```

_test_06_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "X", "C", "O"),
  List.of("O", "X", "X", "X", "O"),
  List.of("C", "X", "O", "O", "O")
);

Source.closestCarrot(grid, 2, 2); // -> 5
```

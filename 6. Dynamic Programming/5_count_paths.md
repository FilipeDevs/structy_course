Write a method, countPaths, that takes in a grid as an argument. In the grid, 'X' represents walls and 'O' represents open spaces. You may only move down or to the right and cannot pass through walls. The method should return the number of ways possible to travel from the top-left corner of the grid to the bottom-right corner.

_test_00_

```java
List<List<String>> grid = List.of(
  List.of("O", "O"),
  List.of("O", "O")
);
Source.countPaths(grid); // -> 2
```

_test_01_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "X"),
  List.of("O", "O", "O"),
  List.of("O", "O", "O")
);
Source.countPaths(grid); // -> 5
```

_test_02_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "O"),
  List.of("O", "O", "X"),
  List.of("O", "O", "O")
);
Source.countPaths(grid); // -> 3
```

_test_03_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "O"),
  List.of("O", "X", "X"),
  List.of("O", "O", "O")
);
Source.countPaths(grid); // -> 1
```

_test_04_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "X", "O", "O", "O"),
  List.of("O", "O", "X", "O", "O", "O"),
  List.of("X", "O", "X", "O", "O", "O"),
  List.of("X", "X", "X", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O")
);
Source.countPaths(grid); // -> 0
```

_test_05_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "X", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "X"),
  List.of("X", "O", "O", "O", "O", "O"),
  List.of("X", "X", "X", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O")
);
Source.countPaths(grid); // -> 42
```

_test_06_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "X", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "X"),
  List.of("X", "O", "O", "O", "O", "O"),
  List.of("X", "X", "X", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "X")
);
Source.countPaths(grid); // -> 0
```

_test_07_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O")
);
Source.countPaths(grid); // -> 145422675
```

_test_08_

```java
List<List<String>> grid = List.of(
  List.of("O", "O", "X", "X", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "X", "X", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "X", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O", "O"),
  List.of("X", "O", "O", "O", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O", "O"),
  List.of("X", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "X", "X", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "X", "O", "O", "O", "O", "O", "X", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O"),
  List.of("X", "X", "X", "O", "O", "O", "O", "O", "O", "X", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "X", "X", "O", "O", "O", "O", "X", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "X", "X", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O")
);
Source.countPaths(grid); // -> 3190434
```

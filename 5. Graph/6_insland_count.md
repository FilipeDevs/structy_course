Write a method, islandCount, that takes in a grid containing Ws and Ls. W represents water and L represents land. The method should return the number of islands on the grid. An island is a vertically or horizontally connected region of land.

_test_00_

```java
List<List<String>> grid = List.of(
  List.of("W", "L", "W", "W", "W"),
  List.of("W", "L", "W", "W", "W"),
  List.of("W", "W", "W", "L", "W"),
  List.of("W", "W", "L", "L", "W"),
  List.of("L", "W", "W", "L", "L"),
  List.of("L", "L", "W", "W", "W")
);

Source.islandCount(grid); // -> 3
```

_test_01_

```java
List<List<String>> grid = List.of(
  List.of("L", "W", "W", "L", "W"),
  List.of("L", "W", "W", "L", "L"),
  List.of("W", "L", "W", "L", "W"),
  List.of("W", "W", "W", "W", "W"),
  List.of("W", "W", "L", "L", "L")
);

Source.islandCount(grid); // -> 4
```

_test_02_

```java
List<List<String>> grid = List.of(
  List.of("L", "L", "L"),
  List.of("L", "L", "L"),
  List.of("L", "L", "L")
);

Source.islandCount(grid); // -> 1
```

_test_03_

```java
List<List<String>> grid = List.of(
  List.of("W", "W"),
  List.of("W", "W"),
  List.of("W", "W")
);

Source.islandCount(grid); // -> 0
```

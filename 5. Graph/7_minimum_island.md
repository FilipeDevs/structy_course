Write a method, minimumIsland, that takes in a grid containing Ws and Ls. W represents water and L represents land. The method should return the size of the smallest island. An island is a vertically or horizontally connected region of land.

You may assume that the grid contains at least one island.

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

Source.minimumIsland(grid); // -> 2
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

Source.minimumIsland(grid); // -> 1
```

_test_02_

```java
List<List<String>> grid = List.of(
  List.of("L", "L", "L"),
  List.of("L", "L", "L"),
  List.of("L", "L", "L")
);

Source.minimumIsland(grid); // -> 9
```

_test_03_

```java
List<List<String>> grid = List.of(
  List.of("W", "W"),
  List.of("L", "L"),
  List.of("W", "W"),
  List.of("W", "L")
);

Source.minimumIsland(grid); // -> 1
```

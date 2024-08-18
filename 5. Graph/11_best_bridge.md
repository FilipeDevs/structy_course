Write a method, bestBridge, that takes in a grid as an argument. The grid contains water (W) and land (L). There are exactly two islands in the grid. An island is a vertically or horizontally connected region of land. Return the minimum length bridge needed to connect the two islands. A bridge does not need to form a straight line.

_test_00_

```java
List<List<String>> grid = List.of(
  List.of("W", "W", "W", "L", "L"),
  List.of("L", "L", "W", "W", "L"),
  List.of("L", "L", "L", "W", "L"),
  List.of("W", "L", "W", "W", "W"),
  List.of("W", "W", "W", "W", "W"),
  List.of("W", "W", "W", "W", "W")
);
Source.bestBridge(grid); // -> 1
```

_test_01_

```java
List<List<String>> grid = List.of(
  List.of("W", "W", "W", "W", "W"),
  List.of("W", "W", "W", "W", "W"),
  List.of("L", "L", "W", "W", "L"),
  List.of("W", "L", "W", "W", "L"),
  List.of("W", "W", "W", "L", "L"),
  List.of("W", "W", "W", "W", "W")
);
Source.bestBridge(grid); // -> 2
```

_test_02_

```java
List<List<String>> grid = List.of(
  List.of("W", "W", "W", "W", "W"),
  List.of("W", "W", "W", "L", "W"),
  List.of("L", "W", "W", "W", "W")
);
Source.bestBridge(grid); // -> 3
```

_test_03_

```java
List<List<String>> grid = List.of(
  List.of("W", "W", "W", "W", "W", "W", "W", "W"),
  List.of("W", "W", "W", "W", "W", "W", "W", "W"),
  List.of("W", "W", "W", "W", "W", "W", "W", "W"),
  List.of("W", "W", "W", "W", "W", "L", "W", "W"),
  List.of("W", "W", "W", "W", "L", "L", "W", "W"),
  List.of("W", "W", "W", "W", "L", "L", "L", "W"),
  List.of("W", "W", "W", "W", "W", "L", "L", "L"),
  List.of("L", "W", "W", "W", "W", "L", "L", "L"),
  List.of("L", "L", "L", "W", "W", "W", "W", "W"),
  List.of("W", "W", "W", "W", "W", "W", "W", "W")
);
Source.bestBridge(grid); // -> 3
```

_test_04_

```java
List<List<String>> grid = List.of(
  List.of("L", "L", "L", "L", "L", "L", "L", "L"),
  List.of("L", "W", "W", "W", "W", "W", "W", "L"),
  List.of("L", "W", "W", "W", "W", "W", "W", "L"),
  List.of("L", "W", "W", "W", "W", "W", "W", "L"),
  List.of("L", "W", "W", "W", "W", "W", "W", "L"),
  List.of("L", "W", "W", "W", "W", "W", "W", "L"),
  List.of("L", "W", "W", "L", "W", "W", "W", "L"),
  List.of("L", "W", "W", "W", "W", "W", "W", "L"),
  List.of("L", "W", "W", "W", "W", "W", "W", "L"),
  List.of("L", "W", "W", "W", "W", "W", "W", "L"),
  List.of("L", "W", "W", "W", "W", "W", "W", "L"),
  List.of("L", "L", "L", "L", "L", "L", "L", "L")
);
Source.bestBridge(grid); // -> 2
```

_test_05_

```java
List<List<String>> grid = List.of(
  List.of("W", "L", "W", "W", "W", "W", "W", "W"),
  List.of("W", "L", "W", "W", "W", "W", "W", "W"),
  List.of("W", "W", "W", "W", "W", "W", "W", "W"),
  List.of("W", "W", "W", "W", "W", "W", "W", "W"),
  List.of("W", "W", "W", "W", "W", "W", "W", "W"),
  List.of("W", "W", "W", "W", "W", "W", "L", "W"),
  List.of("W", "W", "W", "W", "W", "W", "L", "L"),
  List.of("W", "W", "W", "W", "W", "W", "W", "L")
);
Source.bestBridge(grid); // -> 8
```

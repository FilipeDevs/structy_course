You've been hired to plant flowers in a garden with n different positions. There are m different flower types. The prices of flowers types vary depending on which position they are planted. Your bosses are picky, they tell you to never plant two of the same flower type right next to each other. What is the minimum cost we need to plant a flower in each position of the garden?

Write a method, positioningPlants, that takes in a 2D list with dimensions n * m. Each row of the list represents the costs of the flower types at that position. This means that costs[i][j] represents the cost of planting flower type j at position i. For example:


```
Given these costs,

costs = [
  [4, 3, 7],
  [6, 1, 9],
  [2, 5, 3]
]

The costs of plants at position 1 are $6, $1, and $9.
The cost of planting flower type 0 at position 1 is $6.
The cost of planting flower type 2 at position 1 is $9.
```

The method should return the minimum cost of planting flowers without placing the same flower type in adjacent positions.

_test_00_

```java
Source.positioningPlants(List.of(
  List.of(4, 3, 7),
  List.of(6, 1, 9),
  List.of(2, 5, 3)
)); // -> 7, by doing 4 + 1 + 2.
```

_test_01_

```java
Source.positioningPlants(List.of(
  List.of(12, 14, 5),
  List.of(6, 3, 2)
)); // -> 8
```

_test_02_

```java
Source.positioningPlants(List.of(
  List.of(12, 14, 5),
  List.of(6, 3, 2),
  List.of(4, 2, 7),
  List.of(4, 8, 4),
  List.of(1, 13, 5),
  List.of(8, 6, 7)
)); // -> 23
```

_test_03_

```java
Source.positioningPlants(List.of(
  List.of(12, 14, 5, 13),
  List.of(6, 3, 20, 3),
  List.of(24, 12, 7, 2),
  List.of(4, 80, 45, 3),
  List.of(104, 13, 5, 14),
  List.of(38, 19, 7, 6),
  List.of(12, 2, 1, 2)
)); // -> 26
```

_test_04_

```java
Source.positioningPlants(List.of(
  List.of(12, 14, 50, 12),
  List.of(6, 3, 20, 3),
  List.of(24, 12, 7, 2),
  List.of(4, 80, 45, 3),
  List.of(104, 13, 5, 14),
  List.of(38, 19, 7, 6),
  List.of(1, 20, 1, 2),
  List.of(13, 12, 5, 13),
  List.of(60, 32, 20, 3),
  List.of(24, 12, 7, 2),
  List.of(4, 80, 44, 1),
  List.of(104, 13, 5, 14),
  List.of(38, 19, 76, 6),
  List.of(12, 23, 12, 20),
  List.of(1, 3, 1, 1),
  List.of(1, 2, 12, 5)
)); // -> 74
```

_test_05_

```java
Source.positioningPlants(List.of(
  List.of(12, 14, 50, 12, 13),
  List.of(6, 3, 20, 3, 16),
  List.of(24, 12, 7, 2, 74),
  List.of(4, 80, 45, 3, 100),
  List.of(104, 13, 5, 14, 3),
  List.of(38, 19, 7, 6, 24),
  List.of(1, 20, 1, 2, 31),
  List.of(13, 12, 5, 13, 9),
  List.of(60, 32, 20, 3, 2),
  List.of(24, 12, 7, 2, 42),
  List.of(4, 80, 44, 1, 23),
  List.of(104, 13, 5, 14, 28),
  List.of(38, 19, 76, 6, 12),
  List.of(12, 23, 12, 20, 13),
  List.of(1, 3, 1, 1, 50),
  List.of(1, 2, 12, 5, 36),
  List.of(6, 2, 3, 12, 20),
  List.of(4, 6, 4, 11, 15)
)); // -> 75
```


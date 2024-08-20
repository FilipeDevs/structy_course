Write a method, summingSquares, that takes a target number as an argument. The method should return the minimum number of perfect squares that sum to the target. A perfect square is a number of the form (i\*i) where i >= 1.

For example: 1, 4, 9, 16 are perfect squares, but 8 is not perfect square.

```
Given 12:

summingSquares(12) -> 3

The minimum squares required for 12 is three, by doing 4 + 4 + 4.

Another way to make 12 is 9 + 1 + 1 + 1, but that requires four perfect squares.

```

_test_00_

```java
Source.summingSquares(8); // -> 2
```

_test_01_

```java
Source.summingSquares(9); // -> 1
```

_test_02_

```java
Source.summingSquares(12); // -> 3
```

_test_03_

```java
Source.minChange(102, List.of(1, 5, 10, 25)); // -> 6
```

_test_04_

```java
Source.summingSquares(31); // -> 4
```

_test_05_

```java
Source.summingSquares(50); // -> 2
```

_test_06_

```java
Source.summingSquares(68); // -> 2
```

_test_07_

```java
Source.summingSquares(87); // -> 4
```

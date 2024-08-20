Write a method, countingChange, that takes in an amount and an array of coins. The method should return the number of different ways it is possible to make change for the given amount using the coins.

You may reuse a coin as many times as necessary.

```
For example,

countingChange(4, List.of(1,2,3)) -> 4

There are four different ways to make an amount of 4:

1. 1 + 1 + 1 + 1
2. 1 + 1 + 2
3. 1 + 3
4. 2 + 2

```

_test_00_

```java
Source.countingChange(4, List.of(1, 2, 3)); // -> 4
```

_test_01_

```java
Source.countingChange(8, List.of(1, 2, 3)); // -> 10
```

_test_02_

```java
Source.countingChange(24, List.of(5, 7, 3)); // -> 5
```

_test_03_

```java
Source.countingChange(13, List.of(2, 6, 12, 10)); // -> 0
```

_test_04_

```java
Source.countingChange(512, List.of(1, 5, 10, 25)); // -> 20119
```

_test_05_

```java
Source.countingChange(1000, List.of(1, 5, 10, 25)); // -> 142511
```

_test_06_

```java
Source.countingChange(240, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)); // -> 1525987916
```

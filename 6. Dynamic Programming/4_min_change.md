Write a method minChange that takes in an amount and an array of coins. The method should return the minimum number of coins required to create the amount. You may use each coin as many times as necessary.

If it is not possible to create the amount, then return -1.

_test_00_

```java
Source.minChange(8, List.of(1, 5, 4, 12)); // -> 2, because 4+4 is the minimum coins possible
```

_test_01_

```java
Source.minChange(13, List.of(1, 9, 5, 14, 30)); // -> 5
```

_test_02_

```java
Source.minChange(23, List.of(2, 5, 7)); // -> 4
```

_test_03_

```java
Source.minChange(102, List.of(1, 5, 10, 25)); // -> 6
```

_test_04_

```java
Source.minChange(200, List.of(1, 5, 10, 25)); // -> 8
```

_test_05_

```java
Source.minChange(2017, List.of(4, 2, 10)); // -> -1
```

_test_06_

```java
Source.minChange(271, List.of(10, 8, 265, 24)); // -> -1
```

_test_07_

```java
Source.minChange(0, List.of(4, 2, 10)); // -> 0
```

_test_08_

```java
Source.minChange(0, List.of()); // -> 0
```

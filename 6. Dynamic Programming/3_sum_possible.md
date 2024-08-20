Write a method sumPossible that takes in an amount and a list of positive numbers. The method should return a boolean indicating whether or not it is possible to create the amount by summing numbers of the list. You may reuse numbers of the list as many times as necessary.

You may assume that the target amount is non-negative.

_test_00_

```java
Source.sumPossible(8, List.of(5, 12, 4)); // -> true, 4 + 4
```

_test_01_

```java
Source.sumPossible(15, List.of(6, 2, 10, 19)); // -> false
```

_test_02_

```java
Source.sumPossible(13, List.of(6, 2, 1)); // -> true
```

_test_03_

```java
Source.sumPossible(103, List.of(6, 20, 1)); // -> true
```

_test_04_

```java
Source.sumPossible(12, List.of()); // -> false
```

_test_05_

```java
Source.sumPossible(12, List.of(12)); // -> true
```

_test_06_

```java
Source.sumPossible(0, List.of()); // -> true
```

_test_07_

```java
Source.sumPossible(271, List.of(10, 8, 265, 24)); // -> false
```

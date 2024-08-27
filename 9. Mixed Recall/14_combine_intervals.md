Write a method, combineIntervals, that takes in a list of intervals as an argument. Each interval is a list containing a pair of numbers representing a start and end time. Your method should combine overlapping intervals and return a list containing the combined intervals.

For example:

```
Given two intervals:

[1, 4] and [3, 7]

The intervals overlap and
should be combined into:

[1, 7]
```

You may return the combined intervals in any order.

You can assume that the input list contains at least one interval and all intervals are valid with start < end.

_test_00_

```java
List<List<Integer>> intervals = List.of(
  List.of(1, 4),
  List.of(12, 15),
  List.of(3, 7),
  List.of(8, 13)
);
Source.combineIntervals(intervals);
// -> [ [1, 7], [8, 15] ]
```

_test_01_

```java
List<List<Integer>> intervals = List.of(
  List.of(6, 8),
  List.of(2, 9),
  List.of(10, 12),
  List.of(20, 24)
);
Source.combineIntervals(intervals);
// -> [ [2, 9], [10, 12], [20, 24] ]
```

_test_02_

```java
List<List<Integer>> intervals = List.of(
  List.of(3, 7),
  List.of(5, 8),
  List.of(1, 5)
);
Source.combineIntervals(intervals);
// -> [ [1, 8] ]
```

_test_03_

```java
List<List<Integer>> intervals = List.of(
  List.of(3, 7),
  List.of(10, 13),
  List.of(5, 8),
  List.of(27, 31),
  List.of(1, 5),
  List.of(12, 16),
  List.of(20, 22)
);
Source.combineIntervals(intervals);
// -> [ [1, 8], [10, 16], [20, 22], [27, 31] ]
```

_test_04_

```java
List<List<Integer>> intervals = List.of(
  List.of(3, 7),
  List.of(10, 13),
  List.of(5, 8),
  List.of(27, 31),
  List.of(1, 5),
  List.of(12, 16),
  List.of(20, 32)
);
Source.combineIntervals(intervals);
// -> [ [1, 8], [10, 16], [20, 32] ]
```

_test_05_

```java
List<List<Integer>> intervals = List.of(
  List.of(64, 70),
  List.of(50, 55),
  List.of(62, 65),
  List.of(12, 50),
  List.of(72, 300000)
);
Source.combineIntervals(intervals);
// -> [ [12, 55], [62, 70], [72, 300000] ]
```


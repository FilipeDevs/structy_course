Write a method, subsets, that takes in a list as an argument. The method should return a 2D list where each subarray represents one of the possible subsets of the list.

The elements within the subsets and the subsets themselves may be returned in any order.

You may assume that the input list contains unique elements.

_test_00_

```java
Source.subsets(List.of("a", "b")); // ->
// [
//   [],
//   [ "b" ],
//   [ "a" ],
//   [ "a", "b" ]
// ]
```

_test_01_

```java
Source.subsets(List.of("a", "b", "c")); // ->
// [
//   [],
//   [ "c" ],
//   [ "b" ],
//   [ "b", "c" ],
//   [ "a" ],
//   [ "a", "c" ],
//   [ "a", "b" ],
//   [ "a", "b", "c" ]
// ]
```

_test_02_

```java
Source.subsets(List.of("x")); // ->
// [
//   [],
//   [ "x" ]
// ]
```

_test_03_

```java
Source.subsets(List.of()); // ->
// [
//   []
// ]
```

_test_04_

```java
Source.subsets(List.of("q", "r", "s", "t")); // ->
// [
//   [],
//   [ "t" ],
//   [ "s" ],
//   [ "s", "t" ],
//   [ "r" ],
//   [ "r", "t" ],
//   [ "r", "s" ],
//   [ "r", "s", "t" ],
//   [ "q" ],
//   [ "q", "t" ],
//   [ "q", "s" ],
//   [ "q", "s", "t" ],
//   [ "q", "r" ],
//   [ "q", "r", "t" ],
//   [ "q", "r", "s" ],
//   [ "q", "r", "s", "t" ]
// ]
```

Write a method, createCombinations, that takes in a list and a length as arguments. The method should return a 2D list representing all of the combinations of the specifized length.

The items within the combinations and the combinations themselves may be returned in any order.

You may assume that the input list contains unique elements and 1 <= k <= items.length.

_test_00_

```java
Source.createCombinations(List.of("a", "b", "c"), 2); // ->
// [
//   [ "a", "b" ],
//   [ "a", "c" ],
//   [ "b", "c" ]
// ]
```

_test_01_

```java
Source.createCombinations(List.of("q", "r", "s", "t"), 2); // ->
// [
//   [ "q", "r" ],
//   [ "q", "s" ],
//   [ "q", "t" ],
//   [ "r", "s" ],
//   [ "r", "t" ],
//   [ "s", "t" ]
// ]
```

_test_02_

```java
Source.createCombinations(List.of("q", "r", "s", "t"), 3); // ->
// [
//   [ "q", "r", "s" ],
//   [ "q", "r", "t" ],
//   [ "q", "s", "t" ],
//   [ "r", "s", "t" ]
// ]
```

_test_03_

```java
Source.createCombinations(List.of("1", "28", "94"), 3); // ->
// [
//   [ "1", "28", "94" ]
// ]
```

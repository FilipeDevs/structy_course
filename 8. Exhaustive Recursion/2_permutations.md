Write a method, permutations, that takes in a list an argument. The method should return a 2D list where each subarray represents one of the possible permutations of the list.

The subarrays may be returned in any order.

You may assume that the input list contains unique elements.

_test_00_

```java
Source.permutations(List.of("a", "b", "c")); // ->
// [
//   [ "a", "b", "c" ],
//   [ "b", "a", "c" ],
//   [ "b", "c", "a" ],
//   [ "a", "c", "b" ],
//   [ "c", "a", "b" ],
//   [ "c", "b", "a" ]
// ]
```

_test_01_

```java
Source.permutations(List.of("red", "blue")); // ->
// [
//   [ "red", "blue" ],
//   [ "blue", "red" ]
// ]
```

_test_02_

```java
Source.permutations(List.of("8", "2", "1", "4")); // ->
// [
//   [ "8", "2", "1", "4" ], [ "2", "8", "1", "4" ],
//   [ "2", "1", "8", "4" ], [ "2", "1", "4", "8" ],
//   [ "8", "1", "2", "4" ], [ "1", "8", "2", "4" ],
//   [ "1", "2", "8", "4" ], [ "1", "2", "4", "8" ],
//   [ "8", "1", "4", "2" ], [ "1", "8", "4", "2" ],
//   [ "1", "4", "8", "2" ], [ "1", "4", "2", "8" ],
//   [ "8", "2", "4", "1" ], [ "2", "8", "4", "1" ],
//   [ "2", "4", "8", "1" ], [ "2", "4", "1", "8" ],
//   [ "8", "4", "2", "1" ], [ "4", "8", "2", "1" ],
//   [ "4", "2", "8", "1" ], [ "4", "2", "1", "8" ],
//   [ "8", "4", "1", "2" ], [ "4", "8", "1", "2" ],
//   [ "4", "1", "8", "2" ], [ "4", "1", "2", "8" ]
// ]
```

_test_03_

```java
Source.permutations(List.of()); // ->
// [
//  [ ]
// ]
```

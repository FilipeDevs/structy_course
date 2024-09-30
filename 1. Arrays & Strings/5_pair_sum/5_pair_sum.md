Write a method, pairSum, that takes in an List and a target sum as arguments. The function should return an List containing a pair of indices whose elements sum to the given target. The indices returned must be unique.

Be sure to return the indices, not the elements themselves.

There is guaranteed to be one such pair that sums to the target.

_test_00_

```java
Source.pairSum(List.of(3, 2, 5, 4, 1), 8); // -> [0, 2]
```

_test_01_

```java
Source.pairSum(List.of(4, 7, 9, 2, 5, 1), 5); // -> [0, 5]
```

_test_02_

```java
Source.pairSum(List.of(4, 7, 9, 2, 5, 1), 3); // -> [3, 5]
```

_test_03_

```java
Source.pairSum(List.of(1, 6, 7, 2), 13); // -> [1, 2]
```

_test_04_

```java
Source.pairSum(List.of(9, 9), 18); // -> [0, 1]
```

_test_05_

```java
Source.pairSum(List.of(6, 4, 2, 8 ), 12); // -> [1, 3]
```

_test_06_

```java
ArrayList<Integer> numbers = new ArrayList<>();
for (int i = 1; i <= 25000; i += 1) {
  numbers.add(i);
}
pairSum(numbers, 49999); // -> [ 24998, 24999 ]

```

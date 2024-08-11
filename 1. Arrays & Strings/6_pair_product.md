Write a method, pairProduct, that takes in an List and a target product as arguments. The function should return a List containing a pair of indices whose elements multiply to the given target. The indices returned must be unique.

Be sure to return the indices, not the elements themselves.

There is guaranteed to be one such pair whose product is the target.

_test_00_

```java
Source.pairProduct(List.of(3, 2, 5, 4, 1), 8); // -> [1, 3]
```

_test_01_

```java
Source.pairProduct(List.of(3, 2, 5, 4, 1), 10); // -> [1, 2]
```

_test_02_

```java
Source.pairProduct(List.of(4, 7, 9, 2, 5, 1), 5); // -> [4, 5]
```

_test_03_

```java
Source.pairProduct(List.of(4, 7, 9, 2, 5, 1), 35); // -> [1, 4]
```

_test_04_

```java
Source.pairProduct(List.of(3, 2, 5, 4, 1), 10); // -> [1, 2]
```

_test_05_

```java
Source.pairProduct(List.of(4, 6, 8, 2), 16); // -> [2, 3]
```

_test_06_

```java
ArrayList<Integer> numbers = new ArrayList<>();
for (int i = 1; i <= 25000; i += 1) {
  numbers.add(i);
}
pairProduct(numbers, 624975000); // -> [ 24998, 24999 ]
```

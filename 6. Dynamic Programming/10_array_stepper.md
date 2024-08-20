Write a method, arrayStepper, that takes in a list of numbers as an argument. You start at the first position of the list. The method should return a boolean indicating whether or not it is possible to reach the last position of the list. When situated at some position of the list, you may take a maximum number of steps based on the number at that position.

```
For example, given:

    idx =  0  1  2  3  4  5
numbers = [2, 4, 2, 0, 0, 1]

The answer is true.
We start at idx 0, we could take 1 step or 2 steps forward.
The correct choice is to take 1 step to idx 1.
Then take 4 steps forward to the end at idx 5.

```

_test_00_

```java
Source.arrayStepper(List.of(2, 4, 2, 0, 0, 1)); // -> true
```

_test_01_

```java
Source.arrayStepper(List.of(2, 3, 2, 0, 0, 1)); // -> false
```

_test_02_

```java
Source.arrayStepper(List.of(3, 1, 3, 1, 0, 1)); // -> true
```

_test_03_

```java
Source.arrayStepper(List.of(4, 1, 5, 1, 1, 1, 0, 4)); // -> true
```

_test_04_

```java
Source.arrayStepper(List.of(4, 1, 2, 1, 1, 1, 0, 4)); // -> false
```

_test_05_

```java
Source.arrayStepper(List.of(1, 1, 1, 1, 1, 0)); // -> true
```

_test_06_

```java
Source.arrayStepper(List.of(1, 1, 1, 1, 0, 0)); // -> false
```

_test_07_

```java
Source.arrayStepper(List.of(
  31, 30, 29, 28, 27,
  26, 25, 24, 23, 22,
  21, 20, 19, 18, 17,
  16, 15, 14, 13, 12,
  11, 10, 9, 8, 7, 6,
  5, 3, 2, 1, 0, 0, 0
)); // -> false
```

Write a method, fiveSort, that takes in an ArrayList of numbers as an argument. The method should rearrange elements of the ArrayList such that all 5s appear at the end. Your method should perform this operation in-place by mutating the original ArrayList. The method should return the ArrayList.

Elements that are not 5 can appear in any order in the output, as long as all 5s are at the end of the array.

_test_00_

```java
List<Integer> array = new ArrayList<>(List.of(12, 5, 1, 5, 12, 7));
Source.fiveSort(array);
// -> [12, 7, 1, 12, 5, 5]
```

_test_01_

```java
List<Integer> array = new ArrayList<>(List.of(5, 2, 5, 6, 5, 1, 10, 2, 5, 5));
Source.fiveSort(array);
// -> [2, 2, 10, 6, 1, 5, 5, 5, 5, 5]
```

_test_02_

```java
List<Integer> array = new ArrayList<>(List.of(5, 5, 5, 1, 1, 1, 4));
Source.fiveSort(array);
// -> [4, 1, 1, 1, 5, 5, 5]
```

_test_03_

```java
List<Integer> array = new ArrayList<>(List.of(5, 5, 6, 5, 5, 5, 5));
Source.fiveSort(array);
// -> [6, 5, 5, 5, 5, 5, 5]
```

_test_04_

```java
List<Integer> array = new ArrayList<>(List.of(5, 1, 2, 5, 5, 3, 2, 5, 1, 5, 5, 5, 4, 5));
Source.fiveSort(array);
// -> [4, 1, 2, 1, 2, 3, 5, 5, 5, 5, 5, 5, 5, 5]
```

_test_05_

```java
List<Integer> fives = new ArrayList<>(Collections.nCopies(20000, 5));
List<Integer> fours = new ArrayList<>(Collections.nCopies(20000, 4));
List<Integer> array = new ArrayList<>();
array.addAll(fives);
array.addAll(fours);
Source.fiveSort(array);
// twenty-thousand 4s followed by twenty-thousand 5s
// -> [4, 4, 4, 4, ..., 5, 5, 5, 5]
```

Write a method, prereqsPossible, that takes in a number of courses (n) and prerequisites as arguments. Courses have ids ranging from 0 through n - 1. A single prerequisite of List.of(A, B) means that course A must be taken before course B. The method should return a boolean indicating whether or not it is possible to complete all courses.

_test_00_

```java
int numCourses = 6;
List<List<Integer>> prereqs = List.of(
  List.of(0, 1),
  List.of(2, 3),
  List.of(0, 2),
  List.of(1, 3),
  List.of(4, 5)
);
Source.prereqsPossible(numCourses, prereqs); // -> true
```

_test_01_

```java
int numCourses = 6;
List<List<Integer>> prereqs = List.of(
  List.of(0, 1),
  List.of(2, 3),
  List.of(0, 2),
  List.of(1, 3),
  List.of(4, 5),
  List.of(3, 0)
);
Source.prereqsPossible(numCourses, prereqs); // -> false
```

_test_02_

```java
int numCourses = 5;
List<List<Integer>> prereqs = List.of(
  List.of(2, 4),
  List.of(1, 0),
  List.of(0, 2),
  List.of(0, 4)
);
Source.prereqsPossible(numCourses, prereqs); // -> true
```

_test_03_

```java
int numCourses = 6;
List<List<Integer>> prereqs = List.of(
  List.of(2, 4),
  List.of(1, 0),
  List.of(0, 2),
  List.of(0, 4),
  List.of(5, 3),
  List.of(3, 5)
);
Source.prereqsPossible(numCourses, prereqs); // -> false
```

_test_04_

```java
int numCourses = 8;
List<List<Integer>> prereqs = List.of(
  List.of(1, 0),
  List.of(0, 6),
  List.of(2, 0),
  List.of(0, 5),
  List.of(3, 7),
  List.of(4, 3)
);
Source.prereqsPossible(numCourses, prereqs); // -> true
```

_test_05_

```java
int numCourses = 8;
List<List<Integer>> prereqs = List.of(
  List.of(1, 0),
  List.of(0, 6),
  List.of(2, 0),
  List.of(0, 5),
  List.of(3, 7),
  List.of(7, 4),
  List.of(4, 3)
);
Source.prereqsPossible(numCourses, prereqs); // -> false
```

_test_06_

```java
int numCourses = 42;
List<List<Integer>> prereqs = List.of(List.of(6, 36));
Source.prereqsPossible(numCourses, prereqs); // -> true
```

Write a method sumOfLengths that takes in a list of strings and returns the total length of the strings.

You must solve this recursively.

_test_00_

```java
sumOfLengths(List.of("goat", "cat", "purple")); // -> 13
```

_test_01_

```java
sumOfLengths(List.of("bike", "at", "pencils", "phone")); // -> 18
```

_test_02_

```java
sumOfLengths(List.of()); // -> 0
```

_test_03_

```java
sumOfLengths(List.of("", " ", "  ", "   ", "    ", "     ")); // -> 15
```

_test_04_

```java
sumOfLengths(List.of("0", "313", "1234567890")); // -> 14
```

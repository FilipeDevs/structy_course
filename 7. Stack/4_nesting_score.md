Write a method, nestingScore, that takes in a string of brackets as an argument. The method should return the score of the string according to the following rules:

[] is worth 1 point
XY is worth m + n points where X, Y are substrings of well-formed brackets and m, n are their respective scores
[S] is worth 2 \* k points where S is a substring of well-formed brackets and k is the score of that substring
You may assume that the input only contains well-formed square brackets.

_test_00_

```java
Source.nestingScore("[]"); // -> 1
```

_test_01_

```java
Source.nestingScore("[][][]"); // -> 3
```

_test_02_

```java
Source.nestingScore("[[]]"); // -> 2
```

_test_03_

```java
Source.nestingScore("[[][]]"); // -> 4
```

_test_04_

```java
Source.nestingScore("[[][][]]"); // -> 6
```

_test_05_

```java
Source.nestingScore("[[][]][]"); // -> 5
```

_test_06_

```java
Source.nestingScore("[][[][]][[]]"); // -> 7
```

_test_07_

```java
Source.nestingScore("[[[[[[[][]]]]]]][]"); // -> 129
```

_test_08_

```java
Source.nestingScore(""); // -> 0
```

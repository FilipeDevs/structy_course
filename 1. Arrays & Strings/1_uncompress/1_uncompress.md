Write a method, uncompress, that takes in a string as an argument. The input string will be formatted into multiple groups according to the following pattern:

```
<number><char>

for example, '2c' or '3a'.
```

The method should return an uncompressed version of the string where each 'char' of a group is repeated 'number' times consecutively. You may assume that the input string is well-formed according to the previously mentioned pattern.

_test_00_

```java
Source.uncompress("2c3a1t"); // -> "ccaaat"
```

_test_01_

```java
Source.uncompress("4s2b"); // -> "ssssbb"
```

_test_02_

```java
Source.uncompress("2p1o5p"); // -> "ppoppppp"
```

_test_03_

```java
Source.uncompress("3n12e2z"); // -> "nnneeeeeeeeeeeezz"
```

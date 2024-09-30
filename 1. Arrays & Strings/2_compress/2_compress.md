Write a method, compress, that takes in a string as an argument. The method should return a compressed version of the string where consecutive occurrences of the same characters are compressed into the number of occurrences followed by the character. Single character occurrences should not be changed.

```
'aaa' compresses to '3a'
'cc' compresses to '2c'
't' should remain as 't'
```

You can assume that the input only contains alphabetic characters.

_test_00_

```java
Source.compress("ccaaatsss"); // -> "2c3at3s"
```

_test_01_

```java
Source.compress("ssssbbz"); // -> "4s2bz"
```

_test_02_

```java
Source.compress("ppoppppp"); // -> "2po5p"
```

_test_03_

```java
Source.compress("nnneeeeeeeeeeeezz"); // -> "3n12e2z"
```

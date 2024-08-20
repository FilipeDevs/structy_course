Write a method, maxPalinSubsequence, that takes in a string as an argument. The method should return the length of the longest subsequence of the string that is also a palindrome.

A subsequence of a string can be created by deleting any characters of the string, while maintaining the relative order of characters.

_test_00_

```java
Source.maxPalinSubsequence("luwxult"); // -> 5
```

_test_01_

```java
Source.maxPalinSubsequence("xyzaxxzy"); // -> 6
```

_test_02_

```java
Source.maxPalinSubsequence("lol"); // -> 3
```

_test_03_

```java
Source.maxPalinSubsequence("boabcdefop"); // -> 3
```

_test_04_

```java
Source.maxPalinSubsequence("z"); // -> 1
```

_test_05_

```java
Source.maxPalinSubsequence("chartreusepugvicefree"); // -> 7
```

_test_06_

```java
Source.maxPalinSubsequence("qwueoiuahsdjnweuueueunasdnmnqweuzqwerty"); // -> 15
```

_test_07_

```java
Source.maxPalinSubsequence("enamelpinportlandtildecoldpressedironyflannelsemioticsedisonbulbfashionaxe"); // -> 31
```

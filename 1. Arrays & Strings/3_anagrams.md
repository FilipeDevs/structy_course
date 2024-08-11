Write a method, anagrams, that takes in two strings as arguments. The method should return a boolean indicating whether or not the strings are anagrams. Anagrams are strings that contain the same characters, but in any order.

_test_00_

```java
Source.anagrams("restful", "fluster"); // -> true
```

_test_01_

```java
Source.anagrams("cats", "tocs"); // -> false
```

_test_02_

```java
Source.anagrams("monkeyswrite", "newyorktimes"); // -> true
```

_test_03_

```java
Source.anagrams("elbow", "below"); // -> true
```

_test_04_

```java
Source.anagrams("paper", "reapa"); // -> false
```

_test_05_

```java
Source.anagrams("tax", "taxi"); // -> false
```

_test_06_

```java
Source.anagrams("night", "thing"); // -> true
```

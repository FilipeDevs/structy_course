Write a method, quickestConcat, that takes in a string and a list of words as arguments. The method should return the minimum number of words needed to build the string by concatenating words of the list. If it is not possible to build the string, then return -1.

You may use words of the list as many times as needed.

_test_00_

```java
Source.quickestConcat("caution", List.of("ca", "ion", "caut", "ut")); // -> 2
```

_test_01_

```java
Source.quickestConcat("caution", List.of("ion", "caut", "caution")); // -> 1
```

_test_02_

```java
Source.quickestConcat("respondorreact", List.of("re", "or", "spond", "act", "respond")); // -> 4
```

_test_03_

```java
Source.quickestConcat("simchacindy", List.of("sim", "simcha", "acindy", "ch")); // -> 3
```

_test_04_

```java
Source.quickestConcat("simchacindy", List.of("sim", "simcha", "acindy")); // -> -1
```

_test_05_

```java
Source.quickestConcat("uuuuuu", List.of("u", "uu", "uuu", "uuuu")); // -> 2
```

_test_06_

```java
Source.quickestConcat("rongbetty", List.of("wrong", "bet")); // -> -1
```

_test_07_

```java
Source.quickestConcat("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", List.of("u", "uu", "uuu", "uuuu", "uuuuu")); // -> 7
```

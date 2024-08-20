Write a method, canConcat, that takes in a string and a list of words as arguments. The method should return boolean indicating whether or not it is possible to concatenate words of the list together to form the string.

You may reuse words of the list as many times as needed.

_test_00_

```java
Source.canConcat("oneisnone", List.of("one", "none", "is")); // -> true
```

_test_01_

```java
Source.canConcat("oneisnone", List.of("on", "e", "is")); // -> false
```

_test_02_

```java
Source.canConcat("oneisnone", List.of("on", "e", "is", "n")); // -> true
```

_test_03_

```java
Source.canConcat("foodisgood", List.of("is", "g", "ood", "f")); // -> true
```

_test_04_

```java
Source.canConcat("santahat", List.of("santah", "hat")); // -> false
```

_test_05_

```java
Source.canConcat("santahat", List.of("santah", "san", "hat", "tahat")); // -> true
```

_test_06_

```java
Source.canConcat("rrrrrrrrrrrrrrrrrrrrrrrrrrx", List.of("r", "rr", "rrr", "rrrr", "rrrrr", "rrrrrr")); // -> false
```

_test_07_

```java
Source.canConcat("fooisgood", List.of("foo", "is", "g", "ood", "f")); // -> true
```

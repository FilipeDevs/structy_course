Write a method, befittingBrackets, that takes in a string as an argument. The method should return a boolean indicating whether or not the string contains correctly matched brackets.

You may assume the string contains only characters: ( ) [ ] { }

_test_00_

```java
Source.befittingBrackets("(){}[](())"); // -> true
```

_test_01_

```java
Source.befittingBrackets("({[]})"); // -> true
```

_test_02_

```java
Source.befittingBrackets("[][}"); // -> false
```

_test_03_

```java
Source.befittingBrackets("{[]}({}"); // -> false
```

_test_04_

```java
Source.befittingBrackets("[]{}(}[]"); // -> false
```

_test_05_

```java
Source.befittingBrackets("[]{}()[]"); // -> true
```

_test_06_

```java
Source.befittingBrackets("]{}"); // -> false
```

_test_07_

```java
Source.befittingBrackets("); // -> true
```

_test_08_

```java
Source.befittingBrackets("{[(}])"); // -> false
```

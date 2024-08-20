Write a method, pairedParentheses, that takes in a string as an argument. The method should return a boolean indicating whether or not the string has well-formed parentheses.

You may assume the string contains only alphabetic characters, '(', or ')'.

_test_00_

```java
Source.pairedParentheses("(david)((abby))"); // -> true
```

_test_01_

```java
Source.pairedParentheses("()rose(jeff"); // -> false
```

_test_02_

```java
Source.pairedParentheses(")("); // -> false
```

_test_03_

```java
Source.pairedParentheses("()"); // -> true
```

_test_04_

```java
Source.pairedParentheses("(((potato())))"); // -> true
```

_test_05_

```java
Source.pairedParentheses("(())(water)()"); // -> true
```

_test_06_

```java
Source.pairedParentheses("(())(water()()"); // -> false
```

_test_07_

```java
Source.pairedParentheses(""); // -> true
```

_test_08_

```java
Source.pairedParentheses("))()"); // -> false
```

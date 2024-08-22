Write a method, decompressBraces, that takes in a compressed string as an argument. The method should return the string decompressed.

The compression format of the input string is 'n{subString}', where the subString within braces should be repeated n times.

You may assume that every number n is guaranteed to be an integer between 1 through 9.

You may assume that the input is valid and the decompressed string will only contain alphabetic characters

_test_00_

```java
Source.decompressBraces("2{q}3{tu}v");
// -> qqtututuv
```

_test_01_

```java
Source.decompressBraces("ch3{ao}");
// -> chaoaoao
```

_test_02_

```java
Source.decompressBraces("2{y3{o}}s");
// -> yoooyooos
```

_test_03_

```java
Source.decompressBraces("z3{a2{xy}b}");
// -> zaxyxybaxyxybaxyxyb
```

_test_04_

```java
Source.decompressBraces("2{3{r4{e}r}io}");
// -> reeeerreeeerreeeerioreeeerreeeerreeeerio
```

_test_05_

```java
Source.decompressBraces("go3{spinn2{ing}s}");
// -> gospinningingsspinningingsspinningings
```

_test_06_

```java
Source.decompressBraces("2{l2{if}azu}l");
// -> lififazulififazul
```

_test_07_

```java
Source.decompressBraces("3{al4{ec}2{icia}}");
// -> alececececiciaiciaalececececiciaiciaalececececiciaicia
```

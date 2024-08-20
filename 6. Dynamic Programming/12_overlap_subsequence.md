Write a method, overlapSubsequence, that takes in two strings as arguments. The method should return the length of the longest overlapping subsequence.

A subsequence of a string can be created by deleting any characters of the string, while maintaining the relative order of characters.

_test_00_

```java
Source.overlapSubsequence("dogs", "daogt"); // -> 3
```

_test_01_

```java
Source.overlapSubsequence("xcyats", "criaotsi"); // -> 4
```

_test_02_

```java
Source.overlapSubsequence("xfeqortsver", "feeeuavoeqr"); // -> 5
```

_test_03_

```java
Source.overlapSubsequence("kinfolklivemustache", "bespokekinfolksnackwave"); // -> 11
```

_test_04_

```java
Source.overlapSubsequence(
  "mumblecorebeardleggingsauthenticunicorn",
  "succulentspughumblemeditationlocavore"
); // -> 15
```

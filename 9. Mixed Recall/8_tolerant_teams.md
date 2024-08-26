Write a method, tolerantTeams, that takes in a list of rivalries as an argument. A rivalry is a pair of people who should not be placed on the same team. The method should return a boolean indicating whether or not it is possible to separate people into two teams, without rivals being on the same team. The two teams formed do not have to be the same size.


_test_00_

```java
Source.tolerantTeams(List.of(
  List.of("philip", "seb"),
  List.of("raj", "nader")
)); // -> true
```

_test_01_

```java
Source.tolerantTeams(List.of(
  List.of("philip", "seb"),
  List.of("raj", "nader"),
  List.of("raj", "philip"),
  List.of("seb", "raj")
)); // -> false
```

_test_02_

```java
Source.tolerantTeams(List.of(
  List.of("cindy", "anj"),
  List.of("alex", "matt"),
  List.of("alex", "cindy"),
  List.of("anj", "matt"),
  List.of("brando", "matt")
)); // -> true
```

_test_03_

```java
Source.tolerantTeams(List.of(
  List.of("alex", "anj"),
  List.of("alex", "matt"),
  List.of("alex", "cindy"),
  List.of("anj", "matt"),
  List.of("brando", "matt")
)); // -> false
```

_test_04_

```java
Source.tolerantTeams(List.of(
  List.of("alan", "jj"),
  List.of("betty", "richard"),
  List.of("jj", "simcha"),
  List.of("richard", "christine")
)); // -> true
```

_test_05_

```java
Source.tolerantTeams(List.of(
  List.of("alan", "jj"),
  List.of("jj", "richard"),
  List.of("betty", "richard"),
  List.of("jj", "simcha"),
  List.of("richard", "christine")
)); // -> true
```

_test_06_

```java
Source.tolerantTeams(List.of(
  List.of("alan", "jj"),
  List.of("betty", "richard"),
  List.of("betty", "christine"),
  List.of("jj", "simcha"),
  List.of("richard", "christine")
)); // -> false
```

_test_07_

```java
Source.tolerantTeams(List.of(
  List.of("ara", "boyka"),
  List.of("dennis", "clara"),
  List.of("boyka", "clara")
)); // -> true
```

Write a method, substitutingSynonyms, that takes in a sentence and a map as arguments. The map contains words as keys whose values are arrays containing synonyms. The method should return a list containing all possible sentences that can be formed by substituting words of the sentence with their synonyms.

You may return the possible sentences in any order, as long as you return all of them.

_test_00_

```java
String sentence = "follow the yellow brick road";
Map<String, List<String>> synonyms = Map.of(
  "follow", List.of("chase", "pursue"),
  "yellow", List.of("gold", "amber", "lemon")
);

Source.substituteSynonyms(sentence, synonyms);
// [
//   "chase the gold brick road",
//   "chase the amber brick road",
//   "chase the lemon brick road",
//   "pursue the gold brick road",
//   "pursue the amber brick road",
//   "pursue the lemon brick road"
// ]
```

_test_01_

```java
String sentence = "I think its gonna be a long long time";
Map<String, List<String>> synonyms = Map.of(
  "think", List.of("believe", "reckon"),
  "long", List.of("lengthy", "prolonged")
);

Source.substituteSynonyms(sentence, synonyms);
// [
//   "I believe it's gonna be a lengthy lengthy time",
//   "I believe it's gonna be a lengthy prolonged time",
//   "I believe it's gonna be a prolonged lengthy time",
//   "I believe it's gonna be a prolonged prolonged time",
//   "I reckon it's gonna be a lengthy lengthy time",
//   "I reckon it's gonna be a lengthy prolonged time",
//   "I reckon it's gonna be a prolonged lengthy time",
//   "I reckon it's gonna be a prolonged prolonged time"
// ]
```

_test_02_

```java
String sentence = "palms sweaty knees weak arms heavy";
Map<String, List<String>> synonyms = Map.of(
  "palms", List.of("hands", "fists"),
  "heavy", List.of("weighty", "hefty", "burdensome"),
  "weak", List.of("fragile", "feeble", "frail", "sickly")
);

Source.substituteSynonyms(sentence, synonyms);
// [
//   "hands sweaty knees fragile arms weighty",
//   "hands sweaty knees fragile arms hefty",
//   "hands sweaty knees fragile arms burdensome",
//   "hands sweaty knees feeble arms weighty",
//   "hands sweaty knees feeble arms hefty",
//   "hands sweaty knees feeble arms burdensome",
//   "hands sweaty knees frail arms weighty",
//   "hands sweaty knees frail arms hefty",
//   "hands sweaty knees frail arms burdensome",
//   "hands sweaty knees sickly arms weighty",
//   "hands sweaty knees sickly arms hefty",
//   "hands sweaty knees sickly arms burdensome",
//   "fists sweaty knees fragile arms weighty",
//   "fists sweaty knees fragile arms hefty",
//   "fists sweaty knees fragile arms burdensome",
//   "fists sweaty knees feeble arms weighty",
//   "fists sweaty knees feeble arms hefty",
//   "fists sweaty knees feeble arms burdensome",
//   "fists sweaty knees frail arms weighty",
//   "fists sweaty knees frail arms hefty",
//   "fists sweaty knees frail arms burdensome",
//   "fists sweaty knees sickly arms weighty",
//   "fists sweaty knees sickly arms hefty",
//   "fists sweaty knees sickly arms burdensome"
// ]
```

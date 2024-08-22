import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

class Source {
    public static List<String> substituteSynonyms(String sentence, Map<String, List<String>> synonyms) {
        List<String> words = Arrays.asList(sentence.split(" "));
        List<List<String>> lists = generate(words, synonyms);

        List<String> finalSentences = new ArrayList<>();
        for (List<String> list : lists) {
            finalSentences.add(String.join(" ", list));
        }
        return finalSentences;
    }

    public static List<List<String>> generate(List<String> words, Map<String, List<String>> synonyms) {
        if (words.size() == 0) {
            return List.of(List.of());
        }

        String word = words.get(0);
        List<List<String>> subLists = generate(words.subList(1, words.size()), synonyms);

        if (synonyms.containsKey(word)) {
            List<List<String>> results = new ArrayList<>();
            for (String substitute : synonyms.get(word)) {
                for (List<String> subList : subLists) {
                    List<String> result = new ArrayList<>();
                    result.add(substitute);
                    result.addAll(subList);

                    results.add(result);
                }
            }
            return results;
        } else {
            List<List<String>> results = new ArrayList<>();
            for (List<String> subList : subLists) {
                List<String> result = new ArrayList<>();
                result.add(word);
                result.addAll(subList);

                results.add(result);
            }
            return results;
        }
    }

}

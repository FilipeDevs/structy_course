import java.util.HashMap;

class Source {

    public static HashMap<Character, Integer> convertToMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.get(c) == null) {
                map.put(c, 1); // new char set to 1 occ
            } else { // same char, add occ
                int current = map.get(c); // get current char occ
                map.put(c, current + 1); // overwrite + 1 occ
            }
        }

        return map;
    }

    public static boolean anagrams(String s1, String s2) {
        boolean result = convertToMap(s1).equals(convertToMap(s2));
        return result;
    }
}
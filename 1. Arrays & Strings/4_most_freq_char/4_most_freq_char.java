import java.util.HashMap;

class Source {
    public static char mostFrequentChar(String s) {

        // build frequency map
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.get(c) == null) {
                map.put(c, 1); // 1st occ
            } else {
                int currentOcc = map.get(c);
                map.put(c, currentOcc + 1);
            }
        }

        char mostFreq = '0';
        int currentMaxOcc = 0;

        /**
         * find most frequent char
         * For the tiebreaking logic the original String
         * has the "keyset" in order of insertion
         */
        for (char c : s.toCharArray()) {
            if (map.get(c) > currentMaxOcc) {
                currentMaxOcc = map.get(c);
                mostFreq = c;
            }
        }

        return mostFreq;
    }
}

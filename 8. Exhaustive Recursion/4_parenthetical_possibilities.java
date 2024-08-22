import java.util.List;
import java.util.ArrayList;

class Source {
    public static List<String> parentheticalPossibilities(String s) {
        if (s.length() == 0) {
            return List.of("");
        }

        List<String> groupInfo = parseGroup(s);
        String group = groupInfo.get(0);
        String remainder = groupInfo.get(1);

        List<String> suffixes = parentheticalPossibilities(remainder);

        List<String> result = new ArrayList<>();
        for (char ch : group.toCharArray()) {
            for (String suffix : suffixes) {
                result.add(ch + suffix);
            }
        }

        return result;
    }

    private static List<String> parseGroup(String s) {
        if (s.charAt(0) == '(') {
            int closeIndex = s.indexOf(')');
            String group = s.substring(1, closeIndex);
            String remainder = s.substring(closeIndex + 1, s.length());
            return List.of(group, remainder);
        } else {
            String group = String.valueOf(s.charAt(0));
            String remainder = s.substring(1, s.length());
            return List.of(group, remainder);
        }
    }

}

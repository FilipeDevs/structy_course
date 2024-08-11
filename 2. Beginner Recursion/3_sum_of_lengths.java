import java.util.List;

class Source {
    public static int sumOfLengths(List<String> strings) {
        if (strings.isEmpty()) {
            return 0;
        }

        return strings.get(0).length() + sumOfLengths(strings.subList(1, strings.size()));
    }
}

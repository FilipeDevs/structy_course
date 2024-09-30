import java.util.List;

class Source {
    public static int sumNumbersRecursive(List<Integer> numbers) {

        if (numbers.isEmpty()) {
            return 0;
        }

        return numbers.get(0) + sumNumbersRecursive(numbers.subList(1, numbers.size()));
    }

}

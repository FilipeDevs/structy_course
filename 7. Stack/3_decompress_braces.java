import java.util.Stack;

class Source {

    public static String decompressBraces(String str) {

        String numbers = "123456789";
        Stack<String> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c) || Character.isAlphabetic(c)) {
                stack.push(String.valueOf(c));
            } else if (c == '}') { // closing bracket -> start decompressing
                String segment = "";
                while (!numbers.contains(stack.peek())) {
                    segment = stack.pop() + segment;
                }
                int number = Integer.valueOf(stack.pop()); // number
                stack.push(segment.repeat(number));
            }
        }

        String result = "";

        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }

        return result;
    }

}

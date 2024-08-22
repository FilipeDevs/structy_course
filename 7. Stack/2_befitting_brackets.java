import java.util.Stack;
import java.util.Map;

class Source {
    public static boolean befittingBrackets(String str) {

        Map<Character, Character> brackets = Map.of(
                '(', ')',
                '[', ']',
                '{', '}');

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (brackets.containsKey(c)) { // opening bracket ?
                stack.push(c);
            } else { // closing bracket
                if (!stack.isEmpty()) { // closing bracket can come first but stack will be empty
                    char top = stack.pop();
                    if (brackets.get(top) != c) { // does current open bracket match the closing bracket ?
                        return false;
                    }
                } else { // closing bracket came in but stack is empty so no opening bracket available
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}

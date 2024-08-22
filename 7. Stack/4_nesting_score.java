import java.util.Stack;

class Source {

    public static int nestingScore(String str) {

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char c : str.toCharArray()) {
            if (c == '[') {
                stack.push(0);
            } else { // closing bracket start counting
                int top = stack.pop();

                if (top > 0) {
                    top = top * 2;
                } else {
                    top += 1;
                }

                stack.push(stack.pop() + top);
            }
        }

        return stack.pop();
    }

}

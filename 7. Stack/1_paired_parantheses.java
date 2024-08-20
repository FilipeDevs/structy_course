class Source {
    public static boolean pairedParentheses(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') {
                count += 1;
            } else if (c == ')') {
                if (count > 0) {
                    count -= 1;
                } else {
                    return false;
                }
            }
        }
        return count == 0;
    }

}

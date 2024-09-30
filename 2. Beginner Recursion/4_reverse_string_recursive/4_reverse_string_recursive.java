class Source {
    public static String reverseString(String s) {
        if (s.length() == 0) {
            return "";
        }

        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }
}

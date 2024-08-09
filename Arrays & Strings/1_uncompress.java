class Source {
    public static String uncompress(String s) {
        // two pointers approach
        String result = "";
        int startIndex = 0;
        int currentIndex = 0;

        while (currentIndex < s.length()) {
            if (Character.isDigit(s.charAt(currentIndex))) {
                // is digit so increase window
                currentIndex += 1;
            } else {
                // char found -> process window
                int numberChar = Integer.parseInt(s.substring(startIndex, currentIndex));
                for (int i = 0; i < numberChar; i++) {
                    result += s.charAt(currentIndex);
                }
                // reset two pointers
                currentIndex += 1;
                startIndex = currentIndex;
            }
        }

        return result;
    }
}
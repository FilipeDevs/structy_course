class Source {
    public static String compress(String s) {
        // Two pointers
        String result = "";
        s += "!"; // add special char to mark end of string
        int startStreak = 0;
        int endStreak = 0;

        while (endStreak < s.length()) {
            if (s.charAt(startStreak) == s.charAt(endStreak)) {
                endStreak++; // same char continue streak;
            } else { // different char end of streak
                int count = endStreak - startStreak;
                if (count < 2) {
                    result += s.charAt(startStreak);
                } else {
                    result += Integer.toString(count) + s.charAt(startStreak);
                }
                startStreak = endStreak;
            }
        }

        return result;
    }

}
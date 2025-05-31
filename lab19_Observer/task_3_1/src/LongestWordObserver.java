public class LongestWordObserver implements LineObserver {
    private String longestWord = "";

    @Override
    public void onLineRead(String line) {
        // Розбиваємо рядок на слова по пробілам 
        String[] words = line.split("\\s+");
        for (String w : words) {
            if (w.length() > longestWord.length()) {
                longestWord = w;
            }
        }
    }

    @Override
    public void onComplete() {
        System.out.println("Longest word: \"" + longestWord + "\" (length=" + longestWord.length() + ")");
        System.out.println();
    }

    public String getLongestWord() {
        return longestWord;
    }
}

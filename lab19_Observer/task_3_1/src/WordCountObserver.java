public class WordCountObserver implements LineObserver {
    private long totalWords = 0;

    @Override
    public void onLineRead(String line) {
        // Розбиваємо на слова і додаємо до загальної суми
        String[] words = line.split("\\s+");
        for (String w : words) {
            if (!w.isEmpty()) {
                totalWords++;
            }
        }
    }

    @Override
    public void onComplete() {
        System.out.println("Total word count: " + totalWords);
        System.out.println();
    }

    public long getTotalWords() {
        return totalWords;
    }
}

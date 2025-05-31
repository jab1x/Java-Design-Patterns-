public class LineWithLongestWordObserver implements LineObserver {
    private final LongestWordObserver longestWordObserver;
    private String lineContainingLongest = "";

    public LineWithLongestWordObserver(LongestWordObserver longestWordObserver) {
        this.longestWordObserver = longestWordObserver;
    }

    @Override
    public void onLineRead(String line) {
        String currentLongest = longestWordObserver.getLongestWord();
        if (!currentLongest.isEmpty()) {
            for (String w : line.split("\\s+")) {
                if (w.equals(currentLongest)) {
                    lineContainingLongest = line;
                    break;
                }
            }
        }
    }

    @Override
    public void onComplete() {
        if (!lineContainingLongest.isEmpty()) {
            System.out.println("Line containing the longest word \"" +
                longestWordObserver.getLongestWord() + "\":");
            System.out.println(lineContainingLongest);
            System.out.println();
        } else {
            System.out.println("No line contained the longest word.");
            System.out.println();
        }
    }

    public String getLineContainingLongestWord() {
        return lineContainingLongest;
    }
}

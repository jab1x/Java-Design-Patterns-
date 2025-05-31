public class LongestLineObserver implements LineObserver {
    private String longestLine = "";

    @Override
    public void onLineRead(String line) {
        if (line.length() > longestLine.length()) {
            longestLine = line;
        }
    }

    @Override
    public void onComplete() {
        System.out.println("Longest line (" + longestLine.length() + " chars):");
        System.out.println(longestLine);
        System.out.println();
    }

    public String getLongestLine() {
        return longestLine;
    }
}

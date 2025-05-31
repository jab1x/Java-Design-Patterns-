public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("resources/input01.txt");

        LongestLineObserver      longestLineObs      = new LongestLineObserver();
        LongestWordObserver      longestWordObs      = new LongestWordObserver();
        WordCountObserver        wordCountObs        = new WordCountObserver();
        LineWithLongestWordObserver lineWithLongestObs = new LineWithLongestWordObserver(longestWordObs);

        fileReader.addObserver(longestLineObs);
        fileReader.addObserver(longestWordObs);
        fileReader.addObserver(wordCountObs);
        fileReader.addObserver(lineWithLongestObs);

        fileReader.read();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private final String filePath;
    private final List<LineObserver> observers = new ArrayList<>();

    public FileReader(String filePath) {
        this.filePath = filePath;
    }


    public void addObserver(LineObserver observer) {
        observers.add(observer);
    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            reader.lines().forEach(line -> {
                System.out.println(line);
                for (LineObserver obs : observers) {
                    obs.onLineRead(line);
                }
            });
            for (LineObserver obs : observers) {
                obs.onComplete();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

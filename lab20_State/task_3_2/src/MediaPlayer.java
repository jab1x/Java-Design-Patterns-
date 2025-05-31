import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

    private final List<String> tracks = new ArrayList<>();
    private State state;
    private int currentTrackNum = 0;

    public MediaPlayer() {
        this.state = StoppedState.INSTANCE;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void addTrack(String track) {
        tracks.add(track);
    }

    public int getCurrentTrackNum() {
        return currentTrackNum;
    }

    public void setTrackNum(int trackNum) {
        if (trackNum < 0 || trackNum >= tracks.size()) {
            return;
        }
        this.currentTrackNum = trackNum;
    }

    public String getCurrentTrack() {
        return tracks.isEmpty() ? "" : tracks.get(currentTrackNum);
    }

    public void setState(State newState) {
        this.state = newState;
    }

    public State getState() {
        return state;
    }

    // Методи делегують поточному стану
    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void next() {
        state.next(this);
    }

    public void prev() {
        state.prev(this);
    }

    public void stop() {
        state.stop(this);
    }
}

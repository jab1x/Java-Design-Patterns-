public class MediaPlayer {
    private State state;
    private String icon;

    public MediaPlayer() {
        this.state = PausedState.INSTANCE;
        this.icon = "play button";
    }

    void setState(State state) {
        this.state = state;
    }

    State getState() {
        return state;
    }

    void setIcon(String icon) {
        this.icon = icon;
    }

    String getIcon() {
        return icon;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }
}

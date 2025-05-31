public class PausedState implements State {
    public static final PausedState INSTANCE = new PausedState();
    private PausedState() { }

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Resuming track: " + player.getCurrentTrack());
        player.setState(PlayingState.INSTANCE);
    }

    @Override
    public void pause(MediaPlayer player) {
    }

    @Override
    public void next(MediaPlayer player) {
        int nextIndex = player.getCurrentTrackNum() + 1;
        if (nextIndex < player.getTracks().size()) {
            player.setTrackNum(nextIndex);
            System.out.println("Track set to: " + player.getCurrentTrack() + " (paused)");
        }
    }

    @Override
    public void prev(MediaPlayer player) {
        int prevIndex = player.getCurrentTrackNum() - 1;
        if (prevIndex >= 0) {
            player.setTrackNum(prevIndex);
            System.out.println("Track set to: " + player.getCurrentTrack() + " (paused)");
        }
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopped");
        player.setState(StoppedState.INSTANCE);
    }
}

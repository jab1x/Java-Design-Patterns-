public class StoppedState implements State {
    public static final StoppedState INSTANCE = new StoppedState();
    private StoppedState() { }

    @Override
    public void play(MediaPlayer player) {
        if (player.getTracks().isEmpty()) {
            System.out.println("No tracks to play.");
            return;
        }
        System.out.println("Playing track: " + player.getCurrentTrack());
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
            System.out.println("Track set to: " + player.getCurrentTrack() + " (stopped)");
        }
    }

    @Override
    public void prev(MediaPlayer player) {
        int prevIndex = player.getCurrentTrackNum() - 1;
        if (prevIndex >= 0) {
            player.setTrackNum(prevIndex);
            System.out.println("Track set to: " + player.getCurrentTrack() + " (stopped)");
        }
    }

    @Override
    public void stop(MediaPlayer player) {
    }
}

public class PlayingState implements State {
    public static final PlayingState INSTANCE = new PlayingState();
    private PlayingState() { }

    @Override
    public void play(MediaPlayer player) {
    }

    @Override
    public void pause(MediaPlayer player) {
        player.setState(PausedState.INSTANCE);
        player.setIcon("play button");
        System.out.println("Video paused, icon set to " + player.getIcon());
    }
}

public class PausedState implements State {
    public static final PausedState INSTANCE = new PausedState();
    private PausedState() { }

    @Override
    public void play(MediaPlayer player) {
        player.setState(PlayingState.INSTANCE);
        player.setIcon("pause button");
        System.out.println("Video playing, icon set to " + player.getIcon());
    }

    @Override
    public void pause(MediaPlayer player) {
    }
}

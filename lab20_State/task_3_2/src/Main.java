public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.addTrack("track1");
        mediaPlayer.addTrack("track2");
        mediaPlayer.addTrack("track3");
        mediaPlayer.addTrack("track4");
        mediaPlayer.addTrack("track5");
        mediaPlayer.addTrack("track6");

        mediaPlayer.play();   // повинен почати відтворювати "track1"
        mediaPlayer.pause();  // поставить "track1" на паузу
        mediaPlayer.play();   // відновить відтворення "track1"
        mediaPlayer.next();   // перейде до "track2" і продовжить відтворювати
        mediaPlayer.next();   // перейде до "track3"
        mediaPlayer.prev();   // повернеться до "track2"
        mediaPlayer.stop();   // зупиняє відтворення
        mediaPlayer.play();   // відтворює "track2" з початку
        mediaPlayer.stop();   // зупиняє
    }
}

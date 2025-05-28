public class Main {

    public static void main(String[] args) {
        String fileName = "youtubevideo.ogg";

        VideoFile original = new VideoFile(
            fileName,
            new Buffer("Byte buffer of video"),
            new Buffer("Byte buffer of audio")
        );

        original.play(new MPEG4CompressionCodec());

        VideoConversionFacade facade = new VideoConversionFacade();
        VideoFile mp4 = facade.convert(original, new MPEG4CompressionCodec());

        mp4.play(new MPEG4CompressionCodec());
    }
}

public class VideoConversionFacade {

    /**
     * Конвертує даний відеофайл у новий формат .
     *
     * @param file         оригінальний відеофайл
     * @param targetCodec  кодек, у форматі якого хочемо отримати результат
     * @return             новий VideoFile із необхідним кодеком та підміною аудіодоріжки
     */
    public VideoFile convert(VideoFile file, Codec targetCodec) {
        System.out.println("\nVideoConversionFacade: conversion started");

        // визначаємо кодек-джерело
        Codec sourceCodec = CodecFactory.extract(file);

        // зчитуємо і декодуємо відеопотік
        Buffer videoData = BitrateReader.read(file, sourceCodec);

        // кодуємо у потрібний формат
        VideoFile converted = BitrateReader.convert(videoData, file.getName(), targetCodec);

        // підмінюємо аудіо
        new AudioMixer().fix(converted, file.getAudioBuffer());

        System.out.println("VideoConversionFacade: conversion completed \n");
        return converted;
    }
}

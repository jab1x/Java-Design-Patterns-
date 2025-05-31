public interface LineObserver {
    /**
     * Викликається кожного разу, коли FileReader прочитав новий рядок.
     * @param line — сам прочитаний рядок (без символу newline).
     */
    void onLineRead(String line);

    /**
     * Викликається після того, як файл повністю прочитано.
     * Може використовуватися для виводу остаточного результату.
     */
    default void onComplete() { }
}

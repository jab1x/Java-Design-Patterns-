class FileProcessor {
    private static FileProcessor instance;
    
    private FileProcessor() {}
    
    public static FileProcessor getInstance() {
        if (instance == null) {
            instance = new FileProcessor();
        }
        return instance;
    }
    
    public String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return content.toString();
    }
    
    public void processFile(String filePath) {
        String content = readFile(filePath);
        System.out.println("Processing file content:\n" + content);
    }
}

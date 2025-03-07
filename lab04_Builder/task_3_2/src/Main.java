public class Main {
    public static void main(String[] args) {
        StringBuilderCustom customBuilder = new StringBuilderCustom();
        String result = customBuilder.append("Hello")
                                     .append(" World")
                                     .insert(5, ",")
                                     .build();
        
        System.out.println(result); // Hello, World
    }
}

public interface User {
    String getUserId();
    Role getRole();

    void sendMessageAll(String message);
    void sendMessage(String message, String userTo);
    void sendMessageGroup(String message, String group);

    void receiveMassage(String message, String userFrom);
}

import java.util.Set;

public interface ChatMediator {
    void registerUser(User user);
    void sendToAll(String message, User from);
    void sendToUser(String message, User from, String userTo);
    void sendToGroup(String message, User from, String group);
}

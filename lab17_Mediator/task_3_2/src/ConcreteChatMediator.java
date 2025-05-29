import java.util.*;

public class ConcreteChatMediator implements ChatMediator {
    private final Map<String, User> users = new HashMap<>();
    private final Map<String, Set<String>> groups = new HashMap<>();

    @Override
    public void registerUser(User user) {
        users.put(user.getUserId(), user);
        groups.computeIfAbsent("all", k -> new HashSet<>()).add(user.getUserId());
        String grp = user.getRole().name().toLowerCase();
        groups.computeIfAbsent(grp, k -> new HashSet<>()).add(user.getUserId());
    }

    @Override
    public void sendToAll(String message, User from) {
        for (User u : users.values()) {
            if (!u.getUserId().equals(from.getUserId())) {
                u.receiveMassage(message, from.getUserId());
            }
        }
    }

    @Override
    public void sendToUser(String message, User from, String userTo) {
        User to = users.get(userTo);
        if (to != null) {
            to.receiveMassage(message, from.getUserId());
        }
    }

    @Override
    public void sendToGroup(String message, User from, String group) {
        Set<String> memberIds = groups.get(group);
        if (memberIds == null) return;
        for (String id : memberIds) {
            if (!id.equals(from.getUserId())) {
                users.get(id).receiveMassage(message, from.getUserId());
            }
        }
    }
}

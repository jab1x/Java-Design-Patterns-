import java.util.HashMap;
import java.util.Map;

public class SimpleAuthService implements AuthService {

    private final Map<String, String> admins   = new HashMap<>();
    private final Map<String, String> users    = new HashMap<>();

    public SimpleAuthService() {
        admins.put("admin",         "123qweASD");
        admins.put("administrator", "1234");

        users.put("andrii",        "1234");
        users.put("black_knight",  "S@ruman1");
        users.put("white_knight",  "ruman1");
    }

    @Override
    public Account authenticate(String login, String password) 
            throws AuthenticationException {
        if (admins.containsKey(login)) {
            String stored = admins.get(login);
            if (stored.equals(password) && password.length() >= 8) {
                return Account.createAdmin(login, password);
            } else {
                throw new AuthenticationException("Invalid administrator credentials");
            }
        }
        // Звичайні користувачі
        if (users.containsKey(login)) {
            String stored = users.get(login);
            if (stored.equals(password)) {
                return Account.createUser(login, password);
            } else {
                throw new AuthenticationException("Invalid user credentials");
            }
        }
        // гість
        if ("guest".equals(login)) {
            return Account.createGuest();
        }
        throw new AuthenticationException("Unknown login: " + login);
    }
}

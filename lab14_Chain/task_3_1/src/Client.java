public class Client {
    public static void main(String[] args) {
        AuthService authService = new SimpleAuthService();

        String[][] loginAttempts = {
            {"admin",         "123qweASD"},
            {"administrator", "1234"},
            {"andrii",        "1234"},
            {"guest",         ""},
            {"black_knight",  "S@ruman1"},
            {"white_knight",  "S111"},      // некоректний
            {"unknown",       "whatever"}   // невідомий логін
        };

        for (String[] attempt : loginAttempts) {
            String login    = attempt[0];
            String password = attempt[1];
            try {
                Account account = authService.authenticate(login, password);
                System.out.println(
                    account.getAccessType() 
                    + " access provided for '" 
                    + account.getLogin() 
                    + "'");
            } catch (AuthenticationException ex) {
                System.out.println("Access denied for '" 
                                   + login + "': " 
                                   + ex.getMessage());
            }
        }
    }
}

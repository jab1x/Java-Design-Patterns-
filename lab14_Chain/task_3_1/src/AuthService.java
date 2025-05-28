public interface AuthService {
  
    Account authenticate(String login, String password) 
        throws AuthenticationException;
}

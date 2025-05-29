public class ConcreteUser implements User {
    private final String userId;
    private final Role role;
    private final ChatMediator mediator;

    public ConcreteUser(String userId, Role role, ChatMediator mediator) {
        this.userId = userId;
        this.role   = role;
        this.mediator = mediator;
        mediator.registerUser(this);
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public void sendMessageAll(String message) {
        mediator.sendToAll(message, this);
    }

    @Override
    public void sendMessage(String message, String userTo) {
        mediator.sendToUser(message, this, userTo);
    }

    @Override
    public void sendMessageGroup(String message, String group) {
        mediator.sendToGroup(message, this, group);
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: \"" 
            + message + "\" from " + userFrom);
    }
}

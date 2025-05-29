public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ConcreteChatMediator();

        ConcreteUser u1 = new ConcreteUser("User1", Role.ADMIN, mediator);
        ConcreteUser u2 = new ConcreteUser("User2", Role.MODERATOR, mediator);
        ConcreteUser u3 = new ConcreteUser("User3", Role.USER, mediator);
        ConcreteUser u4 = new ConcreteUser("User4", Role.USER, mediator);

        System.out.println("-- Broadcast to all --");
        u1.sendMessageAll("Hello, everyone!");

        System.out.println("\n-- Private message --");
        u2.sendMessage("Hi User3!", "User3");

        System.out.println("\n-- To admins only --");
        u1.sendMessageGroup("Admin meeting at 5pm", "admin");

        System.out.println("\n-- To moderators only --");
        u2.sendMessageGroup("Moderators, please review reports", "moderator");
    }
}

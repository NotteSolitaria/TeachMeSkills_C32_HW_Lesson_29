package D.correct;

public class User {
    private MessageService messageService;

    public User() {
        this.messageService = new EmailService(); // In the correct version there is no need to rewrite all the methods, there is only a need to change the object.
    }

    public void notify(String message) {
        messageService.sendMessage(message);
    }
}

package D;

public class User {
    private EmailService emailService;

    public User() {
        this.emailService = new EmailService();
    }

    public void notifyUser(String message){
        emailService.sendEmail(message);
    }
}

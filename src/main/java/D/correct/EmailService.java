package D.correct;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}

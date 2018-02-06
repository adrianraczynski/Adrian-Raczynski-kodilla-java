package zadanieAllegro;

public class MailService implements InformationService {

   private User user;

    @Override
    public void inform(User user) {

        System.out.println("Sending e-mail to: " + "\n" + user);
    }


}

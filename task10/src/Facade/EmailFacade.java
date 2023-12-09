package Facade;

public class EmailFacade {
    private EmailBuilder emailBuilder;
    private EmailSender emailSender;

    public EmailFacade() {
        this.emailBuilder = new EmailBuilder();
        this.emailSender = new EmailSender();
    }

    public void sendEmail(String to, String subject, String body) {
        String formattedSubject = emailBuilder.buildSubject(subject);
        String formattedBody = emailBuilder.buildBody(body);

        emailSender.sendEmail(to, formattedSubject, formattedBody);
    }
}

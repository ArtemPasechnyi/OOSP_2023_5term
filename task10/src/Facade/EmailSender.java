package Facade;

public class EmailSender {
    public void sendEmail(String to, String subject, String body) {
        System.out.println("Sending email to: " + to);
        System.out.println(subject);
        System.out.println(body);
        System.out.println("Email sent successfully");
    }
}
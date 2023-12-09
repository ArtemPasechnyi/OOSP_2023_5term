package Facade;

public class EmailBuilder {
    public String buildSubject(String subject) {
        return "Subject: " + subject;
    }

    public String buildBody(String body) {
        return "Body: " + body;
    }
}

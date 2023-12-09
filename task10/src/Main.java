import Facade.EmailFacade;

public class Main {
    public static void main(String[] args) {
        EmailFacade emailFacade = new EmailFacade();
        emailFacade.sendEmail("boba@mail.ru", "ysper moglot", "Hello, boba");
    }
}

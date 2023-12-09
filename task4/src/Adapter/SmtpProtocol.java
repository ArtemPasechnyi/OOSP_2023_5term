package Adapter;

public class SmtpProtocol implements SourceProtocol {
    @Override
    public void connect() {
        System.out.println("Connect to SMTP server");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetch data from SMTP server");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect from SMTP server");
    }
}

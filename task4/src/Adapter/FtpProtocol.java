package Adapter;

public class FtpProtocol implements SourceProtocol {
    @Override
    public void connect() {
        System.out.println("Connect to FTP server");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetch data from FTP server");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect from FTP server");
    }
}
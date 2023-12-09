package Adapter;

public class HttpProtocol implements SourceProtocol {
    @Override
    public void connect() {
        System.out.println("Connect to HTTP server");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetch data from HTTP server");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect from HTTP server");
    }
}
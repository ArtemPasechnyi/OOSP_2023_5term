package Adapter;

public interface SourceProtocol {
    void connect();
    void fetchData();
    void disconnect();
}

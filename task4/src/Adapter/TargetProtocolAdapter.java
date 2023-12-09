package Adapter;

public interface TargetProtocolAdapter {
    void connect();
    void sendData(String data);
    String receiveData();
    void disconnect();
}

package Adapter;

public class ProtocolAdapter implements TargetProtocolAdapter {
    private SourceProtocol source;

    public ProtocolAdapter(SourceProtocol source) {
        this.source = source;
    }

    @Override
    public void connect() {
        source.connect();
    }

    @Override
    public void sendData(String data) {
        source.fetchData();
    }

    @Override
    public String receiveData() {
        // Simulate receiving data
        return "Response data from source";
    }

    @Override
    public void disconnect() {
        source.disconnect();
    }
}

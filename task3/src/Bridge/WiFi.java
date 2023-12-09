package Bridge;

public class WiFi implements WiFiDevice {
    @Override
    public void connect() {
        System.out.println("Connecting to Wi-Fi");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Wi-Fi");
    }
}

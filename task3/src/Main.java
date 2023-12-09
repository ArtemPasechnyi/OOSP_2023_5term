import Bridge.*;

public class Main {
    public static void main(String[] args) {
      
        WiFiDevice wiFiDevice = new WiFi();
        BluetoothDevice bluetoothDevice = new Bluetooth();
        ZigbeeDevice zigbeeDevice = new Zigbee();

        NetworkBridge networkBridge = new WirelessNetworkBridge(wiFiDevice, bluetoothDevice, zigbeeDevice);

        System.out.println("Connecting to networks...");
        networkBridge.connect();

        System.out.println("\nDisconnecting from networks...");
        networkBridge.disconnect();
    }
}

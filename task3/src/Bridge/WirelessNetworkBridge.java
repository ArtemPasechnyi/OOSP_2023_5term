package Bridge;

public class WirelessNetworkBridge implements NetworkBridge {
    private WiFiDevice wiFiDevice;
    private BluetoothDevice bluetoothDevice;
    private ZigbeeDevice zigbeeDevice;

    public WirelessNetworkBridge(WiFiDevice wiFiDevice, BluetoothDevice bluetoothDevice, ZigbeeDevice zigbeeDevice) {
        this.wiFiDevice = wiFiDevice;
        this.bluetoothDevice = bluetoothDevice;
        this.zigbeeDevice = zigbeeDevice;
    }

    @Override
    public void connect() {
        wiFiDevice.connect();
        bluetoothDevice.pair();
        zigbeeDevice.join();
    }

    @Override
    public void disconnect() {
        wiFiDevice.disconnect();
        bluetoothDevice.unpair();
        zigbeeDevice.leave();
    }

    @Override
    public void pair() {
        bluetoothDevice.pair();
    }

    @Override
    public void unpair() {
        bluetoothDevice.unpair();
    }

    @Override
    public void join() {
        zigbeeDevice.join();
    }

    @Override
    public void leave() {
        zigbeeDevice.leave();
    }
}

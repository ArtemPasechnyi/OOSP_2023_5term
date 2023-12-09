package Bridge;

public class Bluetooth implements BluetoothDevice {
    @Override
    public void pair() {
        System.out.println("Pairing with Bluetooth");
    }

    @Override
    public void unpair() {
        System.out.println("Unpairing from Bluetooth");
    }
}

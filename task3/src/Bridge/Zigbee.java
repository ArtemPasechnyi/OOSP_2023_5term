package Bridge;

public class Zigbee implements ZigbeeDevice {
    @Override
    public void join() {
        System.out.println("Joining Zigbee network");
    }

    @Override
    public void leave() {
        System.out.println("Leaving Zigbee network");
    }
}


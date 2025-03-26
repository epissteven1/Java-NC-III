package OOP;

abstract class SmartDevice {
    protected String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public void showStatus() {
        System.out.println("Device: " + deviceName);
    }
}

class SmartLight extends SmartDevice {

    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Light is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now OFF");
    }
}

class SmartSpeaker extends SmartDevice {

    public SmartSpeaker(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Speaker is now playing music");
    }

    @Override
    public void turnOff() {
        System.out.println("Speaker is now OFF");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartLight smartLight = new SmartLight("Smart Light");
        SmartSpeaker smartSpeaker = new SmartSpeaker("Smart Speaker");

        System.out.println("Smart Light:");
        smartLight.turnOn();
        smartLight.showStatus();
        smartLight.turnOff();

        System.out.println("\nSmart Speaker:");
        smartSpeaker.turnOn();
        smartSpeaker.showStatus();
        smartSpeaker.turnOff();
    }
}

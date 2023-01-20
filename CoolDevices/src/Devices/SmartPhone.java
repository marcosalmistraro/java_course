package Devices;

public class SmartPhone extends SmartDevice {

    public boolean flightMode;

    public SmartPhone(String brand, String name, boolean flightMode)  {
        super(brand, name);
        this.flightMode = flightMode;
    }

    public void setBatteryLevel(Double battery) {
        this.battery = battery;
    }

    public void setFlightMode(boolean flightMode) {
        if (flightMode == true) {
            System.out.println(name + " is now in flight mode.");
        } else {
            System.out.println("Flight mode deactivated for " + name);
        }
        this.flightMode = flightMode;
    }

    public void enableCalling() {
        if (flightMode == false) {
            super.enableCalling();
        }
    }
}
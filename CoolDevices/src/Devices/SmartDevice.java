package Devices;

public class SmartDevice implements Reachable, HealthTracking{
    
    public String brand;
    public String name;
    public Double battery;
    public boolean canTakeCalls;
    public boolean healthTracking;

    public SmartDevice(String brand, String name) {
        this.brand = brand;
        this.name = name;
        this.battery = 100.0;
        canTakeCalls = false;
        healthTracking = false;
    }

    public void enableTracking() {
        if (battery > 5) {
            healthTracking = true;
            System.out.println(name + " is now using health tracking.");
        } else {
            System.out.println("Insufficient battery (" + battery + ") to enable health tracking.");
        }
    }

    public void disableTracking() {
        healthTracking = false;
        System.out.println("Health tracking disabled for " + name + ".");
    }

    public void enableCalling() {
        canTakeCalls = true;
        System.out.println("Calls are now active on " + name + ".");
    }

    public void disableCalling() {
        canTakeCalls = false;
        System.out.println("Calls are now deactivated on " + name + ".");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
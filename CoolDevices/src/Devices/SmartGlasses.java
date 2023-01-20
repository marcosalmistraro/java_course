package Devices;

public class SmartGlasses extends SmartDevice {

    public boolean augmentedReality;
    public String resolution;
    public boolean connected;

    public SmartGlasses(String brand, String name, boolean augmentedReality, String resolution) {
        super(brand, name);
        this.augmentedReality = augmentedReality;
        this.resolution = resolution;
        this.connected = false;
    }

    public void connectToPhone(boolean connected) {
        this.connected = connected;
        if (connected) {
            System.out.println("Connection to " + name + " established.");
        } else {
            System.out.println("Disconnection from " + name);
        }
    }

    public void enableCalling() {
        if (connected){
            super.enableCalling();
        } else {
            System.out.println("Connection to " + name + " could not be established.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; resolution: " + resolution;
    } 
}
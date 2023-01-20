package Devices;

public class SmartWatch extends SmartDevice{

    private boolean connected;
    private Double heartRate;

    public SmartWatch(String brand, String name) {
        super(brand, name);
        this.connected = false;
        heartRate = 0.0;
    }

    public void setBatteryLevel(Double battery) {
        this.battery = battery;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
        String output = "Activity in progress (heart rate = " + heartRate + ")";
        if (super.canTakeCalls){
            output += ". Calls enabled.";
        } else {
            output += ". Not taking calls at the moment.";
        }
        System.out.println(output);
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
        if (heartRate > 0 && heartRate < 140 && connected) {
            super.enableCalling();
        } else {
            System.out.println("Connection to " + name + " could not be established. Heart rate needs to be in the range (0; 140).");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (battery: " + this.battery + "; HR = " + heartRate + ")";
    }
}
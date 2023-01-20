package Devices;

import java.util.ArrayList;
import java.util.HashMap;

public class DeviceCollection{

    public String name;
    public HashMap<String, ArrayList<SmartDevice>> myDevices;
    
    public DeviceCollection(String name) {
        this.name = name;
        this.myDevices = new HashMap<>();
    }

    public void addDevices(String brand, ArrayList<SmartDevice> devices) {
        if (!(myDevices.keySet().contains(brand))) {
            myDevices.put(brand, devices);
        } else {
            ArrayList<SmartDevice> brandList = myDevices.get(brand);
            for (SmartDevice device : devices) {
                brandList.add(device);
            }
            myDevices.put(brand, brandList);
        }
    }

    public ArrayList<SmartDevice> getDevices(String brand) {
        return myDevices.get(brand);
    }
}
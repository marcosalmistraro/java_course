package Main;

import java.util.ArrayList;

import Devices.DeviceCollection;
import Devices.SmartDevice;
import Devices.SmartGlasses;
import Devices.SmartPhone;
import Devices.SmartWatch;
import Devices.HealthTracking;
import Devices.Reachable;

public class Main {

    public static void main(String[] args) {

        DeviceCollection myDevices = new DeviceCollection("Gadget Collector");
		
		String appleBrand = "Apple";
		String googleBrand = "Google";
		String samsungBrand = "Samsung";
		
		printDevices(appleBrand, myDevices.getDevices(appleBrand));
		System.out.println();
		
		SmartPhone googlePhone = new SmartPhone(googleBrand, "Google Pixel 4a 5G 128GB Black", false);
		googlePhone.setBatteryLevel(92.5);
		SmartWatch googleWear = new SmartWatch(googleBrand, "Google Pixel Watch");
		googleWear.setBatteryLevel(4.2);
		SmartGlasses googleGlasses = new SmartGlasses(googleBrand, "Google Glass", false, "640 × 360");
		
		ArrayList<SmartDevice> googleDevices = new ArrayList<SmartDevice>();
		googleDevices.add(googlePhone);
		googleDevices.add(googleWear);
		googleDevices.add(googleGlasses);
		myDevices.addDevices(googleBrand, googleDevices);
		
		SmartPhone samsungPhoneOne = new SmartPhone(samsungBrand, "Samsung Galaxy A51 (SM-A515F/DS) Dual SIM 128GB", false);
		SmartPhone samsungPhoneTwo = new SmartPhone(samsungBrand, "Samsung Galaxy S20 5G 256GB", true);
		SmartWatch samsungWatchOne = new SmartWatch(samsungBrand, "Samsung Galaxy Watch3 Zwart 45 mm");
		SmartWatch samsungWatchTwo = new SmartWatch(samsungBrand, "Galaxy Watch Active");
		
		ArrayList<SmartDevice> samsungDevices = new ArrayList<SmartDevice>();
		samsungDevices.add(samsungPhoneOne);
		samsungDevices.add(samsungPhoneTwo);
		samsungDevices.add(samsungWatchOne);
		samsungDevices.add(samsungWatchTwo);
		myDevices.addDevices(samsungBrand, samsungDevices);
		
		printDevices(googleBrand, myDevices.getDevices(googleBrand));
		printDevices(samsungBrand, myDevices.getDevices(samsungBrand));
		
		// Enable health tracking for all devices
		System.out.println();
		for (Devices.HealthTracking device : myDevices.getDevices(googleBrand)) {
			device.enableTracking();
		}
		System.out.println();

		// Disable health tracking for all devices
		for (HealthTracking device : myDevices.getDevices(googleBrand)) {
			device.disableTracking();
		}
		System.out.println();
		
		// Enable all devices to take calls
		for (Reachable device : myDevices.getDevices(googleBrand)) {
			device.enableCalling();
		}
		System.out.println();

		// Disable all devices from taking calls
		for (Reachable device : myDevices.getDevices(googleBrand)) {
			device.disableCalling();
		}
		System.out.println();
		
		googlePhone.setFlightMode(true);
		System.out.println();

		googleGlasses.connectToPhone(true);
		googleWear.connectToPhone(true);
		System.out.println();
		
		googleWear.setHeartRate(155);
		
		// Enable all devices to take calls
		for (SmartDevice device : myDevices.getDevices(googleBrand)) {
			device.enableCalling();
		}
		
		googleWear.setHeartRate(85);
		googleWear.enableCalling();
		googleWear.setHeartRate(90);
    }

    private static void printDevices(String brand, ArrayList<SmartDevice> devices) {
        if (devices == null) {
            System.out.println("No " + brand + " devices in your collection.");
        } else {
            System.out.println(brand + ": " + devices.size() + " devices");
            for (SmartDevice device : devices) {
                System.out.println(" " + device);
            }
        }
    }   
}
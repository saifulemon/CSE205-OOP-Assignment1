/**
 * Base class demonstrating Inheritance in OOP
 * ElectronicDevice serves as a parent class for all electronic devices
 * Contains common properties and methods shared by all devices
 */
public class ElectronicDevice {
    // Common property for all electronic devices
    private String brand;

    /**
     * Constructor to initialize the device with a brand
     * @param brand The manufacturer or brand name of the device
     */
    public ElectronicDevice(String brand) {
        this.brand = brand;
        System.out.println("ElectronicDevice constructor called for brand: " + brand);
    }

    /**
     * Getter for brand
     * @return The brand name
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Common method to power on the device
     * This can be overridden by child classes for specific behavior
     */
    public void powerOn() {
        System.out.println(brand + " device is powering on...");
    }

    /**
     * Display device information
     */
    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

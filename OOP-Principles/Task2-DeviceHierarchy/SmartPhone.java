/**
 * SmartPhone class demonstrates Inheritance
 * Extends ElectronicDevice and adds smartphone-specific features
 * Shows how to use super() to call parent constructor and override methods
 */
public class SmartPhone extends ElectronicDevice {
    private int batteryLevel;

    /**
     * Constructor for SmartPhone
     * Uses super() to call parent class constructor - this is REQUIRED
     * when parent class has a parameterized constructor
     *
     * @param brand The manufacturer of the smartphone
     * @param batteryLevel Initial battery level (0-100)
     */
    public SmartPhone(String brand, int batteryLevel) {
        super(brand); // MUST call parent constructor first
        this.batteryLevel = batteryLevel;
        System.out.println("SmartPhone constructor called");
    }

    /**
     * Getter for battery level
     * @return Current battery level
     */
    public int getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * Setter for battery level
     * @param batteryLevel New battery level
     */
    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        }
    }

    /**
     * Override powerOn() method to provide smartphone-specific behavior
     * This demonstrates method overriding in inheritance
     */
    @Override
    public void powerOn() {
        System.out.println("Booting Android/iOS...");
        System.out.println(getBrand() + " smartphone is starting up");
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    /**
     * SmartPhone specific method
     */
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    /**
     * Display smartphone information
     */
    @Override
    public void displayInfo() {
        System.out.println("\n=== SmartPhone Information ===");
        super.displayInfo(); // Call parent's displayInfo
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Type: SmartPhone");
    }
}

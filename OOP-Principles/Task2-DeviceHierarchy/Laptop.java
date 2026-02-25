/**
 * Laptop class demonstrates Inheritance
 * Extends ElectronicDevice and adds laptop-specific features
 * Shows constructor chaining with super()
 */
public class Laptop extends ElectronicDevice {
    private int ramSize; // RAM size in GB

    /**
     * Constructor for Laptop
     * Uses super() to call parent class constructor
     *
     * @param brand The manufacturer of the laptop
     * @param ramSize RAM size in GB
     */
    public Laptop(String brand, int ramSize) {
        super(brand); // Call parent constructor
        this.ramSize = ramSize;
        System.out.println("Laptop constructor called");
    }

    /**
     * Getter for RAM size
     * @return RAM size in GB
     */
    public int getRamSize() {
        return ramSize;
    }

    /**
     * Setter for RAM size
     * @param ramSize New RAM size in GB
     */
    public void setRamSize(int ramSize) {
        if (ramSize > 0) {
            this.ramSize = ramSize;
        }
    }

    /**
     * Override powerOn() method for laptop-specific behavior
     */
    @Override
    public void powerOn() {
        System.out.println(getBrand() + " laptop is booting up...");
        System.out.println("Initializing " + ramSize + "GB RAM...");
        System.out.println("Loading operating system...");
    }

    /**
     * Laptop specific method
     */
    public void runProgram(String programName) {
        System.out.println("Running " + programName + " on " + getBrand() + " laptop");
    }

    /**
     * Display laptop information
     */
    @Override
    public void displayInfo() {
        System.out.println("\n=== Laptop Information ===");
        super.displayInfo(); // Call parent's displayInfo
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Type: Laptop");
    }
}

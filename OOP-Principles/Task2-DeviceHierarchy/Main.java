/**
 * Main class to demonstrate Inheritance in Java
 *
 * Key Concepts:
 * 1. Inheritance allows a class to inherit properties and methods from a parent class
 * 2. The 'extends' keyword is used to establish inheritance
 * 3. super() is used to call the parent class constructor
 * 4. Child classes can override parent methods to provide specific implementations
 * 5. Child classes inherit all accessible members from the parent class
 *
 * Watch Out:
 * - If parent has a parameterized constructor, child MUST call it using super()
 * - super() must be the FIRST statement in the child constructor
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("  OOP PRINCIPLE: INHERITANCE");
        System.out.println("  Task: Electronic Device Hierarchy");
        System.out.println("===========================================\n");

        // Create a SmartPhone object
        System.out.println("--- Creating SmartPhone ---");
        SmartPhone iPhone = new SmartPhone("Apple", 85);

        System.out.println("\n--- SmartPhone Operations ---");
        iPhone.displayInfo();
        iPhone.powerOn(); // Overridden method
        iPhone.makeCall("123-456-7890");

        System.out.println("\n===========================================\n");

        // Create a Laptop object
        System.out.println("--- Creating Laptop ---");
        Laptop dellLaptop = new Laptop("Dell", 16);

        System.out.println("\n--- Laptop Operations ---");
        dellLaptop.displayInfo();
        dellLaptop.powerOn(); // Overridden method
        dellLaptop.runProgram("IntelliJ IDEA");

        System.out.println("\n===========================================");

        // Demonstrate polymorphism with inheritance
        System.out.println("\n--- Polymorphic Behavior ---");
        System.out.println("Using parent class reference:\n");

        // Parent class reference can point to child class objects
        ElectronicDevice device1 = iPhone;
        ElectronicDevice device2 = dellLaptop;

        device1.powerOn(); // Calls SmartPhone's overridden method
        System.out.println();
        device2.powerOn(); // Calls Laptop's overridden method

        System.out.println("\n===========================================");
        System.out.println("  Key Takeaways:");
        System.out.println("  1. SmartPhone and Laptop inherit from");
        System.out.println("     ElectronicDevice");
        System.out.println("  2. Both use super() to call parent");
        System.out.println("     constructor");
        System.out.println("  3. Both override powerOn() for specific");
        System.out.println("     behavior");
        System.out.println("  4. Child classes can add their own");
        System.out.println("     properties and methods");
        System.out.println("===========================================");
    }
}

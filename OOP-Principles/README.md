# OOP Principles - Student Tasks Solutions

This directory contains complete implementations of all student tasks from the "OOP Principles with Java Examples" PDF.

## Overview

Five comprehensive tasks demonstrating fundamental Object-Oriented Programming principles:

1. **Task 1: Bank System** - Abstraction
2. **Task 2: Device Hierarchy** - Inheritance
3. **Task 3: Payment Gateway** - Polymorphism
4. **Task 4: University System** - Composition & Aggregation
5. **Task 5: Event Planner** - Delegation

---

## Task 1: Bank System (Abstraction)

**Location:** `Task1-BankSystem/`

**Concept:** Abstraction - hiding implementation details and showing only essential features

**Files:**
- `BankAccount.java` - Abstract base class with `calculateInterest()` abstract method
- `SavingsAccount.java` - Concrete class with 5% interest rate
- `CurrentAccount.java` - Concrete class with 0% interest rate
- `Main.java` - Demonstration program

**Key Learning:**
- Cannot instantiate abstract classes directly
- Subclasses must implement all abstract methods
- Abstract classes can have both abstract and concrete methods
- Common properties shared in abstract parent class

**To Run:**
```bash
cd Task1-BankSystem
javac *.java
java Main
```

---

## Task 2: Device Hierarchy (Inheritance)

**Location:** `Task2-DeviceHierarchy/`

**Concept:** Inheritance - child classes inherit properties and methods from parent class

**Files:**
- `ElectronicDevice.java` - Base class with `brand` property and `powerOn()` method
- `SmartPhone.java` - Subclass with `batteryLevel` and overridden `powerOn()`
- `Laptop.java` - Subclass with `ramSize` and overridden `powerOn()`
- `Main.java` - Demonstration program

**Key Learning:**
- Use `extends` keyword to establish inheritance
- Use `super()` to call parent constructor (MUST be first statement)
- Child classes can override parent methods with `@Override`
- Child classes inherit all accessible members from parent
- Method overriding enables polymorphic behavior

**To Run:**
```bash
cd Task2-DeviceHierarchy
javac *.java
java Main
```

---

## Task 3: Payment Gateway (Polymorphism)

**Location:** `Task3-PaymentGateway/`

**Concept:** Polymorphism - same interface, different implementations (runtime polymorphism)

**Files:**
- `PaymentMethod.java` - Interface defining payment contract
- `CreditCard.java` - Implementation for credit card payments
- `PayPal.java` - Implementation for PayPal payments
- `ShoppingCart.java` - Uses polymorphism to process any payment method
- `Main.java` - Demonstration program

**Key Learning:**
- Runtime polymorphism (Dynamic Method Dispatch)
- Interface-based programming
- Easy to add new payment methods without changing existing code
- Loose coupling between classes
- Method executed determined at runtime based on actual object type

**To Run:**
```bash
cd Task3-PaymentGateway
javac *.java
java Main
```

---

## Task 4: University System (Composition & Aggregation)

**Location:** `Task4-UniversitySystem/`

**Concept:** Two types of "has-a" relationships with different lifecycles

**Files:**
- `University.java` - Creates and owns departments (Composition)
- `Department.java` - Part of university, has professors (Aggregation)
- `Professor.java` - Independent entity that can move between departments
- `Main.java` - Demonstration program

**Key Learning:**

**COMPOSITION (Strong Relationship):**
- University OWNS departments
- Departments created by university
- When university closes, departments are destroyed
- "Part-of" relationship

**AGGREGATION (Weak Relationship):**
- Department HAS professors
- Professors exist independently
- Professors can move between departments
- When department closes, professors continue to exist
- "Has-a" relationship

**Real-world Analogy:**
- Your heart is COMPOSED in your body (can't exist separately)
- Your phone is AGGREGATED in your pocket (exists independently)

**To Run:**
```bash
cd Task4-UniversitySystem
javac *.java
java Main
```

---

## Task 5: Event Planner (Delegation)

**Location:** `Task5-EventPlanner/`

**Concept:** Delegation - passing responsibility to other objects instead of inheriting

**Files:**
- `Chef.java` - Specialist who handles cooking
- `Musician.java` - Specialist who handles music
- `EventPlanner.java` - Delegates tasks to Chef and Musician
- `Main.java` - Demonstration program

**Key Learning:**
- EventPlanner doesn't implement cooking or music logic itself
- Instead, it DELEGATES to specialist objects
- Favors composition over inheritance
- Single Responsibility Principle
- Loose coupling and high flexibility
- Easy to change team members

**Quote:** "Favor object composition over class inheritance" - Gang of Four

**To Run:**
```bash
cd Task5-EventPlanner
javac *.java
java Main
```

---

## Quick Start Guide

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line / Terminal access

### To Install Java (if not installed):

**Ubuntu/Debian:**
```bash
sudo apt update
sudo apt install default-jdk
```

**Fedora:**
```bash
sudo dnf install java-latest-openjdk-devel
```

**macOS:**
```bash
brew install openjdk
```

**Windows:**
Download and install from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://adoptium.net/)

### Verify Installation:
```bash
java -version
javac -version
```

---

## Running All Tasks

You can run all tasks at once with this script:

```bash
#!/bin/bash
for task in Task1-BankSystem Task2-DeviceHierarchy Task3-PaymentGateway Task4-UniversitySystem Task5-EventPlanner; do
    echo "====================================="
    echo "Running $task"
    echo "====================================="
    cd $task
    javac *.java
    java Main
    cd ..
    echo ""
    echo ""
done
```

Save this as `run_all.sh`, make it executable with `chmod +x run_all.sh`, and run with `./run_all.sh`

---

## Summary of OOP Principles

### 1. Abstraction
- Hide implementation details
- Show only essential features
- Use abstract classes and interfaces

### 2. Inheritance
- Code reuse through parent-child relationships
- Use `extends` keyword
- Child inherits parent's properties and methods

### 3. Polymorphism
- Same interface, different implementations
- Runtime polymorphism (method overriding)
- Compile-time polymorphism (method overloading)

### 4. Composition
- Strong "part-of" relationship
- Container creates and owns the components
- Component lifecycle tied to container

### 5. Aggregation
- Weak "has-a" relationship
- Components exist independently
- Components can be shared or moved

### 6. Delegation
- Pass responsibility to other objects
- Favor composition over inheritance
- Single Responsibility Principle

---

## Directory Structure

```
OOP-Principles/
├── README.md (this file)
├── Task1-BankSystem/
│   ├── BankAccount.java
│   ├── SavingsAccount.java
│   ├── CurrentAccount.java
│   └── Main.java
├── Task2-DeviceHierarchy/
│   ├── ElectronicDevice.java
│   ├── SmartPhone.java
│   ├── Laptop.java
│   └── Main.java
├── Task3-PaymentGateway/
│   ├── PaymentMethod.java
│   ├── CreditCard.java
│   ├── PayPal.java
│   ├── ShoppingCart.java
│   └── Main.java
├── Task4-UniversitySystem/
│   ├── University.java
│   ├── Department.java
│   ├── Professor.java
│   └── Main.java
└── Task5-EventPlanner/
    ├── Chef.java
    ├── Musician.java
    ├── EventPlanner.java
    └── Main.java
```

---

## Learning Outcomes

After completing these tasks, you will understand:

✓ How to use abstraction to create flexible class hierarchies
✓ How inheritance promotes code reuse
✓ How polymorphism enables runtime flexibility
✓ The difference between composition and aggregation
✓ When to use delegation instead of inheritance
✓ Best practices in object-oriented design

---

## Additional Notes

- All code is heavily commented to explain OOP concepts
- Each Main class includes detailed output explaining what's happening
- Code follows Java naming conventions and best practices
- Examples use real-world scenarios for better understanding

---

## Author

Created as solutions for the "OOP Principles with Java Examples" student tasks.

## License

Free to use for educational purposes.

# OOP Principles - Quick Reference Guide

## 📚 All Tasks at a Glance

| Task | Principle | Key Classes | Files |
|------|-----------|-------------|-------|
| Task 1 | Abstraction | BankAccount, SavingsAccount, CurrentAccount | 4 files |
| Task 2 | Inheritance | ElectronicDevice, SmartPhone, Laptop | 4 files |
| Task 3 | Polymorphism | PaymentMethod, CreditCard, PayPal, ShoppingCart | 5 files |
| Task 4 | Composition & Aggregation | University, Department, Professor | 4 files |
| Task 5 | Delegation | EventPlanner, Chef, Musician | 4 files |

---

## 🚀 Quick Start Commands

### Run Individual Tasks
```bash
# Task 1: Bank System
cd OOP-Principles/Task1-BankSystem && javac *.java && java Main

# Task 2: Device Hierarchy
cd OOP-Principles/Task2-DeviceHierarchy && javac *.java && java Main

# Task 3: Payment Gateway
cd OOP-Principles/Task3-PaymentGateway && javac *.java && java Main

# Task 4: University System
cd OOP-Principles/Task4-UniversitySystem && javac *.java && java Main

# Task 5: Event Planner
cd OOP-Principles/Task5-EventPlanner && javac *.java && java Main
```

### Run All Tasks
```bash
cd OOP-Principles
./run_all.sh
```

---

## 🎯 Core Concepts Cheat Sheet

### 1. ABSTRACTION
```java
// Abstract class - cannot be instantiated
abstract class Shape {
    abstract void draw(); // Must be implemented by subclass
}

class Circle extends Shape {
    void draw() { /* implementation */ }
}

// Cannot do: new Shape(); ❌
// Must do: new Circle(); ✓
```

**Key Points:**
- Use `abstract` keyword
- Can have abstract and concrete methods
- Cannot instantiate directly
- Subclasses must implement abstract methods

---

### 2. INHERITANCE
```java
// Parent class
class Parent {
    String name;
    Parent(String n) { name = n; }
}

// Child class
class Child extends Parent {
    Child(String n) {
        super(n); // MUST call parent constructor
    }
}
```

**Key Points:**
- Use `extends` keyword
- Use `super()` to call parent constructor (must be first line)
- Use `@Override` for method overriding
- Child inherits all accessible members

---

### 3. POLYMORPHISM
```java
// Interface
interface PaymentMethod {
    void pay(double amount);
}

// Implementations
class CreditCard implements PaymentMethod {
    void pay(double amount) { /* credit card logic */ }
}

class PayPal implements PaymentMethod {
    void pay(double amount) { /* PayPal logic */ }
}

// Using polymorphism
PaymentMethod method = new CreditCard(); // ✓
method.pay(100); // Calls CreditCard's pay()

method = new PayPal(); // ✓
method.pay(100); // Calls PayPal's pay()
```

**Key Points:**
- Same interface, different implementations
- Runtime method dispatch
- Easy to extend with new types
- Loose coupling

---

### 4. COMPOSITION (Strong)
```java
class University {
    private List<Department> departments; // Owns departments

    University() {
        departments = new ArrayList<>();
        // University creates its own departments
        departments.add(new Department("CS"));
    }

    void close() {
        // University closes → departments destroyed
        departments.clear();
    }
}
```

**Key Points:**
- Strong "part-of" relationship
- Container creates and owns components
- Component lifecycle tied to container
- Component dies with container

---

### 5. AGGREGATION (Weak)
```java
class Department {
    private List<Professor> professors; // Uses professors

    void addProfessor(Professor p) {
        professors.add(p); // Professor exists independently
    }

    void close() {
        // Department closes → professors still exist
        professors.clear(); // Just removes references
    }
}

// Professor created independently
Professor prof = new Professor("Dr. Smith");
dept1.addProfessor(prof);
dept2.addProfessor(prof); // Same professor, different dept
```

**Key Points:**
- Weak "has-a" relationship
- Components exist independently
- Components can be shared
- Component survives container

---

### 6. DELEGATION
```java
class EventPlanner {
    private Chef chef;
    private Musician musician;

    EventPlanner(Chef c, Musician m) {
        chef = c;
        musician = m;
    }

    void hostParty() {
        // Delegate to specialists
        chef.cookFood();
        musician.playMusic();
        // EventPlanner doesn't implement these itself!
    }
}
```

**Key Points:**
- Pass responsibility to other objects
- Favor composition over inheritance
- Single Responsibility Principle
- Easy to change behavior

---

## 🔍 When to Use What?

### Use ABSTRACTION when:
- You want to define a contract/blueprint
- You have common behavior across multiple classes
- You want to hide implementation details
- You need to force subclasses to implement certain methods

### Use INHERITANCE when:
- You have a clear IS-A relationship
- You want to reuse code from a parent class
- The hierarchy is relatively simple
- You need to override parent behavior

### Use POLYMORPHISM when:
- You want to treat different objects uniformly
- You need runtime flexibility
- You want to easily add new types
- You need loose coupling

### Use COMPOSITION when:
- You have a strong PART-OF relationship
- The component cannot exist without the container
- The container controls component lifecycle
- Example: Car and Engine

### Use AGGREGATION when:
- You have a weak HAS-A relationship
- Components can exist independently
- Components can be shared
- Example: Department and Professor

### Use DELEGATION when:
- You need to avoid complex inheritance
- You want single responsibility per class
- You need flexibility to change behavior
- You want to reuse functionality

---

## 📊 Relationship Comparison

| Aspect | Composition | Aggregation | Delegation |
|--------|-------------|-------------|------------|
| **Ownership** | Strong | Weak | None |
| **Lifecycle** | Tied to container | Independent | Independent |
| **Creation** | Container creates | External creation | External creation |
| **Survival** | Dies with container | Survives container | Survives container |
| **Example** | University-Department | Department-Professor | EventPlanner-Chef |

---

## 🎓 Interview Questions & Answers

### Q1: What's the difference between Abstraction and Interface?
**A:** Abstract classes can have concrete methods and state; interfaces (before Java 8) can only have abstract methods. Use abstract class when you have shared implementation; use interface when you only need to define a contract.

### Q2: What's the difference between Composition and Aggregation?
**A:** Composition is a strong "part-of" relationship where the component dies with the container (e.g., University-Department). Aggregation is a weak "has-a" relationship where components exist independently (e.g., Department-Professor).

### Q3: Why favor composition over inheritance?
**A:**
- More flexible (can change behavior at runtime)
- Avoids inheritance hierarchy complexity
- Prevents fragile base class problem
- Allows single responsibility per class
- Enables multiple "behavior sources" (Java doesn't support multiple inheritance)

### Q4: What is runtime polymorphism?
**A:** The ability to determine which method to call at runtime based on the actual object type, not the reference type. Enables treating different objects uniformly through a common interface.

### Q5: When should I use abstract class vs interface?
**A:**
- Use abstract class when you have shared implementation and state
- Use interface when you only need to define a contract
- Use abstract class for IS-A relationship with shared behavior
- Use interface for CAN-DO relationship

---

## 💡 Best Practices

✓ **Always prefer interfaces over abstract classes when possible**
✓ **Use meaningful names (BankAccount, not Account1)**
✓ **Keep classes focused (Single Responsibility)**
✓ **Favor composition over inheritance**
✓ **Program to interfaces, not implementations**
✓ **Use @Override annotation when overriding methods**
✓ **Make fields private, provide public methods**
✓ **Comment your code, especially OOP design decisions**

---

## 📁 Project Structure
```
OOP-Principles/
├── README.md              ← Detailed documentation
├── SUMMARY.md            ← Complete solutions summary
├── QUICK_REFERENCE.md    ← This file (quick guide)
├── run_all.sh            ← Script to run all tasks
├── Task1-BankSystem/     ← Abstraction
├── Task2-DeviceHierarchy/ ← Inheritance
├── Task3-PaymentGateway/  ← Polymorphism
├── Task4-UniversitySystem/ ← Composition & Aggregation
└── Task5-EventPlanner/    ← Delegation
```

---

## 🔧 Troubleshooting

### Issue: "javac: command not found"
**Solution:** Install Java JDK
```bash
# Ubuntu/Debian
sudo apt install default-jdk

# Fedora
sudo dnf install java-latest-openjdk-devel

# macOS
brew install openjdk
```

### Issue: "Cannot find symbol"
**Solution:** Make sure you're in the correct directory and all .java files are present
```bash
cd TaskX-Name
ls *.java  # Check all files are there
javac *.java  # Compile all
```

### Issue: "Class not found"
**Solution:** Make sure you compiled first, then run from the task directory
```bash
javac *.java  # Compile first
java Main     # Then run (no .java extension)
```

---

## 📖 Additional Learning Resources

- **README.md** - Full documentation with examples
- **SUMMARY.md** - Detailed solutions for each task
- **Source Code** - Heavily commented Java files
- **Main.java files** - Each demonstrates the principle with output

---

## ✅ Verification Checklist

- [ ] Java JDK installed (`java -version`)
- [ ] All 5 task directories present
- [ ] Each task has 4-5 .java files
- [ ] run_all.sh is executable (`chmod +x run_all.sh`)
- [ ] Can compile each task (`javac *.java`)
- [ ] Can run each task (`java Main`)

---

**Last Updated:** February 25, 2026
**Total Tasks:** 5 ✓
**Total Files:** 24 ✓
**Status:** All Complete ✓

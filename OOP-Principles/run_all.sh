#!/bin/bash

# Script to compile and run all OOP principle tasks
# Make this executable with: chmod +x run_all.sh

echo "=========================================="
echo "  OOP PRINCIPLES - ALL TASKS"
echo "  Compiling and Running All Examples"
echo "=========================================="
echo ""

# Array of task directories
tasks=("Task1-BankSystem" "Task2-DeviceHierarchy" "Task3-PaymentGateway" "Task4-UniversitySystem" "Task5-EventPlanner")

# Check if Java is installed
if ! command -v javac &> /dev/null; then
    echo "ERROR: Java compiler (javac) not found!"
    echo "Please install JDK to compile and run these programs."
    echo ""
    echo "Installation instructions:"
    echo "  Ubuntu/Debian: sudo apt install default-jdk"
    echo "  Fedora: sudo dnf install java-latest-openjdk-devel"
    echo "  macOS: brew install openjdk"
    echo ""
    exit 1
fi

# Display Java version
echo "Java version:"
java -version
echo ""
echo "=========================================="
echo ""

# Run each task
for task in "${tasks[@]}"; do
    echo ""
    echo "=========================================="
    echo "  Running: $task"
    echo "=========================================="
    echo ""

    # Navigate to task directory
    cd "$task" || { echo "ERROR: Cannot access $task directory"; continue; }

    # Compile all Java files
    echo "Compiling..."
    if javac *.java 2>&1; then
        echo "Compilation successful!"
        echo ""

        # Run the Main class
        echo "Running Main class:"
        echo "------------------------------------------"
        java Main
        echo "------------------------------------------"
    else
        echo "ERROR: Compilation failed for $task"
    fi

    # Return to parent directory
    cd ..

    echo ""
    echo "Press Enter to continue to next task..."
    read -r
done

echo ""
echo "=========================================="
echo "  ALL TASKS COMPLETED!"
echo "=========================================="
echo ""
echo "Summary:"
echo "  ✓ Task 1: Bank System (Abstraction)"
echo "  ✓ Task 2: Device Hierarchy (Inheritance)"
echo "  ✓ Task 3: Payment Gateway (Polymorphism)"
echo "  ✓ Task 4: University System (Composition & Aggregation)"
echo "  ✓ Task 5: Event Planner (Delegation)"
echo ""

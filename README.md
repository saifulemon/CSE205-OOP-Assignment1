# CSE205 & CSE206 - Object-Oriented Programming Assignment 1

This repository contains solutions for Assignment 1 of the Object-Oriented Programming course (Spring'26).

## Assignment Overview
- **Course Code:** CSE205 and CSE206
- **Course Title:** Object-Oriented Programming
- **Number of Tasks:** 8
- **Semester:** Spring'26

## Tasks Summary

### [Task 1: Display 2 Rightmost Digits in Reverse](Task1/)
Displays the 2 rightmost digits of a student ID in reverse order.

**Example:**
- Input: `23221454`
- Output: `4` then `5`

### [Task 2: Find Largest Among Three Numbers](Task2/)
Finds and displays the largest among three different numbers entered by the user.

**Example:**
- Input: `100, 23, -4`
- Output: `Largest number: 100`

### [Task 3: Leap Year Checker](Task3/)
Determines whether a given year is a leap year or not.

**Rules:**
- Divisible by 4 → Leap year
- Divisible by 100 → Not a leap year (unless also divisible by 400)
- Divisible by 400 → Leap year

**Example:**
- Input: `2020` → Output: `2020 is a leap year`
- Input: `1900` → Output: `1900 is not a leap year`

### [Task 4: CGPA Waiver Eligibility Checker](Task4/)
Determines student eligibility for tuition waiver based on CGPA and completed credits.

**Eligibility:** Minimum 30 credits + CGPA ≥ 3.80

**Waiver Percentages:**
| CGPA Range | Waiver |
|------------|--------|
| 3.80-3.89 | 25% |
| 3.90-3.94 | 50% |
| 3.95-3.99 | 75% |
| 4.00 | 100% |

### [Task 5: Number Statistics Calculator](Task5/)
Takes 10 numbers as input and calculates their sum, average, minimum, and maximum.

**Example Output:**
```
Sum = 17
Minimum = -4
Maximum = 9
Average = 1.7
```

### [Task 6: Pattern Printing](Task6/)
Prints two types of patterns:
- **(a) Square Pattern:** NxN grid of asterisks
- **(b) Triangle Pattern:** Right-angled triangle of asterisks

### [Task 7: Previous Alphabet Printer](Task7/)
Takes a string in lowercase and prints the previous alphabet for each character.
- `'a'` wraps around to `'z'`

**Example:**
- Input: `wxyz` → Output: `vwxy`
- Input: `abcd` → Output: `zabc`

### [Task 8: Remove Consecutive Duplicates](Task8/)
Removes all consecutive duplicate characters from a string.

**Example:**
- Input: `ABBCCCCCBBAB` → Output: `ABCBAB`
- Input: `AAABBBBCDDBBECE` → Output: `ABCDBECE`

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- VS Code with Java extension (recommended)

### Compilation and Execution

For each task, navigate to the respective folder and run:

```bash
# Compile
javac TaskX.java

# Run
java TaskX
```

Example for Task 1:
```bash
cd Task1
javac Task1.java
java Task1
```

For Task 6 (has two files):
```bash
cd Task6
javac Task6SquarePattern.java
java Task6SquarePattern

javac Task6TrianglePattern.java
java Task6TrianglePattern
```

## Project Structure

```
Java/
├── README.md
├── CSE205 and 206 Assignment 1 - Spring'26.pdf
├── Task1/
│   ├── Task1.java
│   └── README.md
├── Task2/
│   └── Task2.java
├── Task3/
│   └── Task3.java
├── Task4/
│   └── Task4.java
├── Task5/
│   └── Task5.java
├── Task6/
│   ├── Task6SquarePattern.java
│   └── Task6TrianglePattern.java
├── Task7/
│   └── Task7.java
└── Task8/
    └── Task8.java
```

## VS Code Setup for Java

Follow this guide to set up Java development in VS Code:
[https://youtu.be/VUcI3Y1Nnak](https://youtu.be/VUcI3Y1Nnak)

## Author

Saiful Islam Emon

## License

This project is for educational purposes as part of university coursework.

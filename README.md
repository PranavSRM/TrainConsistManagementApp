# Train Consist Management App

## Overview

The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages a train’s consist — a collection of bogies attached to an engine.

This project follows an **App-Based Learning approach**, where each use case incrementally introduces **Core Java concepts, Data Structures, Algorithms, and System Design principles** in a real-world railway context.

---

## Objective

The goal of this project is to demonstrate how theoretical programming concepts are applied in real systems:

* Efficient management of train composition
* Ensuring safety and validation constraints
* Preventing invalid operations through structured checks
* Implementing scalable and maintainable designs
* Applying data structures and algorithms to real scenarios

---

## Learning Approach

The application evolves step-by-step across **20 use cases**, each introducing a new concept:

* Start with basic Java constructs
* Move to collections and object-oriented design
* Introduce functional programming (Streams)
* Apply searching and sorting algorithms
* Enforce validation and exception handling
* Conclude with defensive programming

Each stage reflects how real-world systems evolve incrementally.

---

## Features

* Passenger bogie management (capacity tracking)
* Goods bogie handling (cargo + safety rules)
* Dynamic data structures (List, Set, Map)
* Functional operations (filtering, grouping, aggregation)
* Sorting and searching algorithms
* Exception handling and validation
* Performance comparison techniques

---

## Technologies Used

* Java (Core + Advanced Concepts)
* Collections Framework
* Stream API
* JUnit (for testing)

---

## Use Case Breakdown

### UC1 – Initialization

* Initialize train consist
* Basic list usage

### UC2 – Add Bogies

* Dynamic insertion using ArrayList

### UC3 – Remove Bogies

* Deletion operations

### UC4 – Prevent Duplicates

* HashSet usage

### UC5 – Maintain Order

* LinkedHashSet (order + uniqueness)

### UC6 – Map Capacity

* HashMap (key-value mapping)

### UC7 – Sorting with Comparator

* Custom object sorting

### UC8 – Filtering with Streams

* Functional filtering (`filter()`)

### UC9 – Grouping Data

* `Collectors.groupingBy()`

### UC10 – Aggregation

* `map()` + `reduce()` (total capacity)

### UC11 – Regex Validation

* Pattern & Matcher for format validation

### UC12 – Business Rules

* Stream-based rule enforcement (`allMatch()`)

### UC13 – Performance Testing

* Loop vs Stream benchmarking (`nanoTime()`)

### UC14 – Custom Exceptions

* Fail-fast validation using checked exceptions

### UC15 – Runtime Exception Handling

* `try-catch-finally` usage

### UC16 – Manual Sorting

* Bubble Sort implementation

### UC17 – Optimized Sorting

* `Arrays.sort()` (built-in efficiency)

### UC18 – Linear Search

* Sequential search on unsorted data

### UC19 – Binary Search

* Optimized search (O(log n)) on sorted data

### UC20 – Defensive Programming

* Fail-fast validation using `IllegalStateException`
* Prevent search on empty data

---

## Key Concepts Covered

### Core Java

* Classes & Objects
* Exception Handling
* Collections Framework

### Data Structures

* List, Set, Map
* Arrays

### Algorithms

* Sorting (Bubble Sort, Arrays.sort)
* Searching (Linear Search, Binary Search)

### Functional Programming

* Streams API
* Filtering, Mapping, Grouping, Reduction

### System Design Concepts

* Data validation
* Fail-fast principle
* Defensive programming
* Performance awareness

---

## Performance Insights

* Linear Search → O(n)
* Binary Search → O(log n)
* Bubble Sort → O(n²)
* Arrays.sort → O(n log n)

---

## Testing

Each use case includes **JUnit test cases** covering:

* Normal scenarios
* Edge cases
* Invalid inputs
* Boundary conditions

---

## How to Run

1. Clone the repository
2. Navigate to any use case file
3. Compile:

   ```bash
   javac UseCaseXTrainConsistMgmnt.java
   ```
4. Run:

   ```bash
   java UseCaseXTrainConsistMgmnt
   ```

---

## Key Takeaways

* Real-world systems evolve incrementally
* Data structures solve practical problems
* Validation and safety checks are critical
* Performance matters in large-scale systems
* Clean design improves maintainability

---

## Conclusion

This project provides a **complete journey from basic Java to advanced problem-solving**, combining:

* Programming fundamentals
* Data structures & algorithms
* Real-world system design

By the end, it equips learners with the ability to **design, analyze, and implement efficient systems using Java**.

---

## Author

**PranavSRM**

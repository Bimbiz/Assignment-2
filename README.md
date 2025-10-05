# Assignment 2 — Algorithmic Analysis and Peer Code Review  
**Course:** Algorithms & Data Structures  
**Student:** [Bizinskiy Timur]  
**Algorithm:** Shell Sort (with multiple gap sequences: Shell's, Knuth's, Sedgewick's)  
**Student:** []
**Algorithm:** Heap Sort (with in-place implementation with bottom-up heapify)

---

Overview

This project is part of *Assignment 2* and focuses on implementing, analyzing, and optimizing
classic sorting algorithms.  
My part of the assignment is to **implement the Shell Sort algorithm**, including multiple gap sequences:
- Shell’s sequence (n/2, n/4, …, 1)
- Knuth’s sequence (1, 4, 13, 40, 121, …)
- Sedgewick’s sequence (mixed polynomial/exponential gaps)

The project follows a professional development workflow using Maven, Git, and JUnit for testing.

---

Objectives

- Implement efficient sorting algorithms with optimizations.
- Collect runtime metrics (comparisons, swaps, memory access).
- Perform asymptotic complexity analysis (O, Θ, Ω).
- Validate performance through empirical testing and benchmark plotting.
- Conduct peer code review and produce a structured analysis report.

---

Project Structure

assignment2-shellsort/
├── src/
│ ├── main/java/
│ │ ├── algorithms/ShellSort.java
│ │ ├── metrics/PerformanceTracker.java
│ │ └── cli/BenchmarkRunner.java
│ └── test/java/
│ └── algorithms/ShellSortTest.java
├── docs/
│ ├── analysis-report.pdf
│ └── performance-plots/
├── README.md
└── pom.xml



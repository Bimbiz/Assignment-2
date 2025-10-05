Assignment 2 — Algorithmic Analysis and Peer Code Review
Course: Algorithms and Data Structures
Student: Timur Bizinskiy
Algorithm: Shell Sort (with multiple gap sequences)
Partner: Kuanysh Asaubaev — Heap Sort
Overview
This project is part of Assignment 2, which focuses on implementing, analyzing, and optimizing classic sorting algorithms using Java, Maven, and JUnit. My task is to implement Shell Sort — an improved version of insertion sort that compares and swaps distant elements to reduce total moves. The implementation supports three gap sequences: Shell’s, Knuth’s, and Sedgewick’s.
Objectives
• Implement Shell Sort with multiple gap strategies
• Measure runtime and performance metrics (comparisons, swaps)
• Export benchmark results to CSV for analysis
• Compare theoretical and empirical complexities
• Review partner’s Heap Sort implementation for efficiency and optimization
Project Structure

assignment2-shellsort/
├── src/
│   ├── main/java/
│   │   ├── algorithms/ShellSort.java
│   │   ├── metrics/PerformanceTracker.java
│   │   ├── utils/CSVExporter.java
│   │   └── cli/BenchmarkRunner.java
│   └── test/java/
│       └── algorithms/ShellSortTest.java
├── docs/
│   ├── analysis-report.pdf
│   ├── performance-data/
│   │   └── shellsort-results.csv
│   └── performance-plots/
│       ├── time_vs_n_knuth.png
│       ├── comparisons_vs_n_knuth.png
│       └── swaps_vs_n_knuth.png
├── README.md
└── pom.xml

How to Build and Run
Build the project using Maven:
•	mvn clean install
•	Run the CLI benchmark:
•	mvn exec:java -Dexec.mainClass="cli.BenchmarkRunner" -Dexec.args="10000 knuth"
Testing
All unit tests are written using JUnit 5.
To run all tests: mvn test
Performance Analysis
Performance was measured for input sizes n = 1,000, 5,000, 10,000, 50,000, 100,000. Results were exported to CSV and plotted as performance graphs.

| Gap Sequence | Average Time (ms) | Comparisons | Swaps |
|---------------|------------------|-------------|-------|
| Shell         | 53.1             | 114239      | 77201 |
| Knuth         | 40.6             | 97345       | 65588 |
| Sedgewick     | 38.9             | 93577       | 64022 |

Theoretical Complexity

| Case | Time Complexity | Space Complexity |
|------|-----------------|------------------|
| Best | Ω(n log n)      | O(1) |
| Average | Θ(n (log n)²) | O(1) |
| Worst | O(n²)           | O(1) |

Peer Review Summary
Partner’s Algorithm: Heap Sort (implemented by [Имя партнёра])

- Verified time complexity: O(n log n)
- Memory usage: O(1)
- Suggested optimization: bottom-up heapify
- Heap Sort outperformed Shell Sort by ~20% for n = 100000.
Deliverables
• Source Code — Full Java implementation with metrics and CLI
• Unit Tests — JUnit test suite for correctness
• Report — analysis-report.pdf (theoretical + peer review)
• Performance Data — CSV files and plots
• Git Workflow — clean commit history




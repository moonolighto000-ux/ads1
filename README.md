# Assignment 3: Sorting and Searching Algorithm Analysis System

**Student:** Baglanuly Abay  
**Group:** IT-2504

## Objective
The goal of this project is to implement and compare fundamental sorting and searching algorithms in Java. The system measures execution time using `System.nanoTime()` to analyze how algorithm performance scales with different array sizes and structures.

## Algorithms Used
* **Bubble Sort (Basic Sorting)**: A simple comparison-based algorithm used as the baseline for performance. It has a time complexity of $O(n^2)$.
* **Merge Sort (Advanced Sorting)**: A more efficient "divide and conquer" algorithm that recursively splits and merges arrays. It has a time complexity of $O(n \log n)$.
* **Linear Search (Searching)**: A sequential search algorithm that checks each element one by one. It has a time complexity of $O(n)$.

---

## Program Functionality

### 1. Sorter Class
*Responsible for sorting operations.*
* Implements **Bubble Sort** and **Merge Sort**.
* Includes a utility to generate random arrays of various sizes.

### 2. Searcher Class
* Responsible for searching operations.
* Implements the **Linear Search** algorithm to find specific targets within the arrays.

### 3. Experiment Class
*Responsible for running experiments and measuring performance.*
* Measures the exact execution time in nanoseconds for sorting and searching.
* Compares results across small (10), medium (100), and large (1000+) datasets.

### 4. Main Class
*The main entry point that orchestrates the entire process .*
* Instantiates all classes and outputs clear comparison results to the console.

---

## Summary of Work Process
1.  **Setup**: Developed a modular OOP structure with separate classes (`Sorter`, `Searcher`, `Experiment`, `Main`).
2.  **Implementation**:
    * Used `System.nanoTime()` for high-precision time measurement of each algorithm
    * Applied Big-O notation to evaluate theoretical vs. practical performance.
3.  [cite_start]**Testing**: Verified performance on different datasets (Random vs. Sorted) and sizes 
4.  **Challenges**: Ensuring the same data was used for both sorting algorithms to maintain a fair comparison during timing.

---


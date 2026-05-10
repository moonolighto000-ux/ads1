# Assignment 4: Graph Traversal and Representation System

**Student:** Baglanuly Abay
**Group:** IT-2504

## Objective
The goal of this project is to implement a graph representation system using an adjacency list and compare the performance of fundamental traversal algorithms. The system measures execution time to analyze how BFS and DFS scale with different graph sizes.

## Algorithms Used
* **Breadth-First Search (BFS)**: Traverses the graph layer by layer using a queue. It is optimal for finding the shortest path in unweighted graphs. Time complexity: O(V + E).
* **Depth-First Search (DFS)**: Traverses as deep as possible along each branch before backtracking using recursion. Useful for cycle detection and topological sorting. Time complexity: O(V + E).

---

## Program Functionality

### 1. Vertex & Edge Classes
* **Vertex**: Represents a node with a unique identifier (id).
* **Edge**: Represents a connection between a source and destination vertex.

### 2. Graph Class
* **Representation**: Uses an Adjacency List for efficient storage.
* **Methods**: Includes addVertex(), addEdge(), and printGraph() to manage and display the graph structure.
* **Traversals**: Implements the logic for both bfs() and dfs() algorithms.

### 3. Experiment Class
* **Performance Testing**: Automates the creation of graphs of different sizes: Small (10), Medium (30), and Large (100 vertices).
* **Timing**: Uses System.nanoTime() to measure exact execution time for each traversal.
* **Analysis**: Compares results to verify if they match the theoretical Big-O complexity.

### 4. Main Class
* Acts as the entry point to orchestrate the experiments.
* Triggers the creation of graphs, runs traversals, and outputs the results to the console.

---

## Experimental Results

| Graph Size | BFS Time (ns) | DFS Time (ns) |
| :--- |:--------------|:--------------|
| 10 Vertices | [1010500]     | [280600]      |
| 30 Vertices | [596200]      | [461500]      |
| 100 Vertices | [1800100]     | [1916600]     |


---

## Screenshots
* **Screenshot**: `docs/screenshots/screenshot1.png`

---

## Reflection
1. **Learning**: Gained hands-on experience with graph structures and the practical differences between queue-based (BFS) and stack-based (DFS) exploration.
2. **Challenges**: Ensuring the adjacency list correctly handled vertex mapping and managing execution flow for different graph sizes.
3. **Workflow**: Maintained a clean Git history and organized project structure following the required repository layout.
# Assignment 2: Physical & Logical Data Structures (Banking System)

**Student:** Baglanuly Abay  
**Group:** IT-2504

## Objective
The goal of this project is to implement a mini-banking system using various data structures in Java, demonstrating the difference between physical (Arrays) and logical (LinkedList, Stack, Queue) structures.

## Data Structures Used
* **LinkedList (`accounts`)**: Used to store the main database of bank accounts because it allows dynamic resizing as new users join.
* **Stack (`logs`)**: Implemented for the transaction history. It follows the **LIFO** (Last-In, First-Out) principle, allowing the administrator to "Undo" the last action.
* **Queue (`reqs`)**: Used for new account requests. It follows **FIFO** (First-In, First-Out), ensuring that the first person to apply is the first to be processed.
* **Queue (`bills`)**: Used for processing payments in the order they were received.
* **Array**: Used for the initial physical storage of data before migrating it to the logical structure (LinkedList).

---

## Program Functionality 

### 1. Main Menu
*The main entry point with options for Bank, ATM, and Admin services.*

### 2. Bank Services (LinkedList & Queue)
*Requesting a new account and viewing the list of clients.*

### 3. ATM Mode
*Checking balance and performing quick withdrawals.*

### 4. Admin Panel (Stack & Queue Processing)
*Approving requests, adding bills, and using the Undo function via Stack.*

---

## Summary of Work Process
1.  **Setup**: Created a `BankAccount` class to encapsulate user data (ID, Name, Balance).
2.  **Implementation**:
    * Integrated a `Scanner` with buffer cleaning (`nextLine()`) to prevent input errors.
    * Linked the `Stack` to every financial movement to enable the "Undo" feature.
    * Used `Collections.addAll` to efficiently move data from a physical array to a `LinkedList`.
3.  **Testing**: Verified that all logical structures behave as expected (e.g., Queue processes the oldest request first).
4.  **Challenges**: Fixed an issue where the `Scanner` would skip name inputs after `nextInt()`.

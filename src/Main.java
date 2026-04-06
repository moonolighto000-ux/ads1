import java.util.*;

class BankAccount {
    int id;
    String name;
    double balance;

    BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println(id + ") " + name + " | Balance: " + balance);
    }
}

public class Main {

    static LinkedList<BankAccount> accounts = new LinkedList<>();
    static Stack<String> history = new Stack<>();
    static Queue<String> bills = new LinkedList<>();
    static Queue<BankAccount> requests = new LinkedList<>();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        BankAccount[] initial = {
                new BankAccount(1, "Merei", 700000),
                new BankAccount(2, "Abay", 170000),
                new BankAccount(3, "Didar", 150000)
        };

        for (BankAccount acc : initial) {
            accounts.add(acc);
            acc.display();
        }

        while (true) {
            System.out.println("\nMAIN MENU");
            System.out.println("1. Bank");
            System.out.println("2. ATM");
            System.out.println("3. Admin");
            System.out.println("4. Exit");

            int choice = getInt();

            switch (choice) {
                case 1 -> bankMenu();
                case 2 -> atmMenu();
                case 3 -> adminMenu();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static int getInt() {
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Enter number!");
        }
        int x = input.nextInt();
        input.nextLine();
        return x;
    }

    static BankAccount findAccount() {
        System.out.print("Enter name: ");
        String name = input.nextLine();

        for (BankAccount acc : accounts) {
            if (acc.name.equalsIgnoreCase(name)) return acc;
        }
        System.out.println("Not found");
        return null;
    }

    static void showAll() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts");
            return;
        }
        for (BankAccount acc : accounts) {
            acc.display();
        }
    }

    static void deposit() {
        BankAccount acc = findAccount();
        if (acc != null) {
            System.out.print("Deposit amount: ");
            double money = getInt();
            acc.balance += money;

            history.push(acc.name + " deposited " + money);
            System.out.println("Updated balance: " + acc.balance);
        }
    }

    static void withdraw() {
        BankAccount acc = findAccount();
        if (acc != null) {
            System.out.print("Withdraw amount: ");
            double money = getInt();

            if (acc.balance >= money) {
                acc.balance -= money;
                history.push(acc.name + " withdrew " + money);
                System.out.println("Done");
            } else {
                System.out.println("Insufficient funds");
            }
        }
    }

    static void showLast() {
        if (!history.isEmpty())
            System.out.println("Last: " + history.peek());
    }

    static void undo() {
        if (!history.isEmpty()) {
            String last = history.pop();
            System.out.println("Undo: " + last);
        }
    }

    static void addBill() {
        System.out.print("Enter bill: ");
        bills.add(input.nextLine());
    }

    static void processBill() {
        if (!bills.isEmpty())
            System.out.println("Processed: " + bills.poll());
    }

    static void showBills() {
        bills.forEach(System.out::println);
    }

    static void requestAccount() {
        System.out.print("Name: ");
        String name = input.nextLine();
        requests.add(new BankAccount(0, name, 0));
    }

    static void processRequest() {
        if (!requests.isEmpty()) {
            BankAccount acc = requests.poll();
            acc.id = accounts.size() + 1;
            accounts.add(acc);
            System.out.println("Created: " + acc.name);
        }
    }

    static void bankMenu() {
        System.out.println("1.Request account 2.Deposit 3.Withdraw 4.Show");
        int c = getInt();

        if (c == 1) requestAccount();
        else if (c == 2) deposit();
        else if (c == 3) withdraw();
        else if (c == 4) showAll();
    }

    static void atmMenu() {
        BankAccount acc = findAccount();
        if (acc != null) {
            System.out.println("1.Balance 2.Withdraw");
            int c = getInt();

            if (c == 1)
                System.out.println("Balance: " + acc.balance);
            else
                withdraw();
        }
    }

    static void adminMenu() {
        System.out.println("1.Process requests 2.Bills 3.Add bill 4.Process bill 5.Last 6.Undo");
        int c = getInt();

        switch (c) {
            case 1 -> processRequest();
            case 2 -> showBills();
            case 3 -> addBill();
            case 4 -> processBill();
            case 5 -> showLast();
            case 6 -> undo();
        }
    }
}
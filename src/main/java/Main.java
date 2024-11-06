import models.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Bank Operations");
            System.out.println("2. Calculator Operations");
            System.out.println("3. Geometric Shapes Operations");
            System.out.println("4. Employee Operations");
            System.out.println("5. Animal Actions (Dog & Cat)");
            System.out.println("6. Library Operations");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bankOperations();
                    break;
                case 2:
                    calculatorOperations();
                    break;
                case 3:
                    geometricShapesOperations();
                    break;
                case 4:
                    employeeOperations();
                    break;
                case 5:
                    animalActions();
                    break;
                case 6:
                    libraryOperations();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void bankOperations() {
        Scanner scanner = new Scanner(System.in);

        // Creamos una cuenta de cheques y una cuenta de ahorros con saldos iniciales
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        SavingsAccount savingsAccount = new SavingsAccount(2000);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nBank Operations Menu:");
            System.out.println("1. Deposit to Checking Account");
            System.out.println("2. Withdraw from Checking Account");
            System.out.println("3. Deposit to Savings Account");
            System.out.println("4. Withdraw from Savings Account");
            System.out.println("5. Show Balances");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit in Checking Account: ");
                    double depositChecking = scanner.nextDouble();
                    checkingAccount.deposit(depositChecking);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw from Checking Account: ");
                    double withdrawChecking = scanner.nextDouble();
                    checkingAccount.withdraw(withdrawChecking);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit in Savings Account: ");
                    double depositSavings = scanner.nextDouble();
                    savingsAccount.deposit(depositSavings);
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw from Savings Account: ");
                    double withdrawSavings = scanner.nextDouble();
                    savingsAccount.withdraw(withdrawSavings);
                    break;
                case 5:
                    System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
                    System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void calculatorOperations() {
        Calculator calculator = new Calculator();
        System.out.println("Sum of two integers: " + calculator.add(3, 4));
        System.out.println("Sum of two doubles: " + calculator.add(2.5, 3.5));
        System.out.println("Sum of three integers: " + calculator.add(1, 2, 3));
    }

    private static void geometricShapesOperations() {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }

    private static void employeeOperations() {
        PermanentEmployee permEmp = new PermanentEmployee("Alice", "HR", 3000, 5);
        ContractEmployee contEmp = new ContractEmployee("Bob", "IT", 50, 160);

        permEmp.showDetails();
        System.out.println("Vacation Days: " + permEmp.calculateVacations());

        contEmp.showDetails();
        System.out.println("Vacation Days: " + contEmp.calculateVacations());
    }

    private static void animalActions() {
        Dog dog = new Dog("Cesar", 5);
        Cat cat = new Cat("Orange", 2);

        dog.walk();
        dog.eat();

        cat.walk();
        cat.eat();
    }

    private static void libraryOperations() {
        Library library = new Library();
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.showBooks();
    }
}


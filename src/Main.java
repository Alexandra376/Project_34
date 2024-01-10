public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(100000, 0.06);
        CreditAccount creditAccount = new CreditAccount(5000, 0.2);

        double savingsInterest = savingsAccount.calculateInterestRate();
        double creditInterest = creditAccount.calculateInterestRate();

        System.out.println("Interest from Savings Account: " + savingsInterest);
        System.out.println("Interest from Credit Account: " + creditInterest);

        Car car = new Car(500, 1.20);
        Airplane airplane = new Airplane(5000, 5);

        double carFuelConsumption = car.fuelСonsumption();
        double airplaneFuelConsumption = airplane.fuelСonsumption();

        System.out.println("Car Fuel Consumption: " + carFuelConsumption);
        System.out.println("Airplane Fuel Consumption: " + airplaneFuelConsumption);

        PhysicalPerson person = new PhysicalPerson("Paula", "Kelvin");
        LegalPerson company = new LegalPerson("ABC INK", "Budapester Straße 68");

        person.clientsInformation();
        company.clientsInformation();

        User user = new User("5A5B10QW", "5BFR8904");
        Admin admin = new Admin("678GH45D", "678GH45D");

        user.checkPassword();
        admin.checkPassword();

        Programmer programmer = new Programmer(20, 10, "Ketrin", "James");
        Manager manager = new Manager(30, 17, "Mia", "Luna");

        System.out.println("Programmer Salary: " + programmer.salary());
        programmer.printInformation();

        System.out.println("Manager Salary: " + manager.salary());
        manager.printInformation();

        Employee[] employees = new Employee[6];
        employees[0] = new Programmer(20, 160, "John", "Doe");
        employees[1] = new Programmer(25, 150, "Jane", "Smith");
        employees[2] = new Programmer(30, 140, "Bob", "Johnson");
        employees[3] = new Manager(35, 130, "Alice", "Williams");
        employees[4] = new Manager(40, 120, "Charlie", "Brown");
        employees[5] = new Manager(45, 110, "Eve", "Miller");

        Employee highestSalaryEmployee = Employee.findHighestSalaryEmployee(employees);

        System.out.println("Information about the employee with the highest salary:");
        highestSalaryEmployee.printInformation();
        System.out.println("Salary: " + highestSalaryEmployee.salary());
    }
}

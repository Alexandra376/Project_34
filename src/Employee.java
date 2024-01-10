interface Employee {
    double salary();
    void printInformation();
    static Employee findHighestSalaryEmployee(Employee[] employees) {
        Employee highestSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.salary() > highestSalaryEmployee.salary()) {
                highestSalaryEmployee = employee;
            }
        }
        return highestSalaryEmployee;
    }
}
class Programmer implements Employee {
    double workHourPrice;
    double hoursQuantity;
    String name;
    String surname;

    public Programmer(double workHourPrice, double hoursQuantity, String name, String surname) {
        this.workHourPrice = workHourPrice;
        this.hoursQuantity = hoursQuantity;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public double salary() {
        return workHourPrice * hoursQuantity;
    }
    @Override
    public void printInformation() {
        System.out.println("Name of employer" + name);
        System.out.println("Surname of employer" + surname);
    }
}
class Manager implements Employee {
    double workHourPrice;
    double hoursQuantity;
    String name;
    String surname;
    public Manager(double workHourPrice, double hoursQuantity, String name, String surname) {
        this.workHourPrice = workHourPrice;
        this.hoursQuantity = hoursQuantity;
        this.name = name;
        this.surname = surname;
    }
    @Override
    public double salary() {
        return workHourPrice * hoursQuantity;
    }
    @Override
    public void printInformation() {
        System.out.println("Name of employer: " + name);
        System.out.println("Surname of employer: " + surname);
    }
}

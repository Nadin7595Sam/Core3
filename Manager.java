public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, String position, String phone, double salary, int age) {
        super(name, position, phone, salary, age);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void increaseSubordinatesSalaries(Employee[] employees, double increaseAmount) {
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                continue;
            }
            double newSalary = employee.getSalary() + increaseAmount;
            employee.setSalary(newSalary);
        }
    }

    public void assignTask(Employee employee1, String разработатьНовыйФункционал) {
    }
}
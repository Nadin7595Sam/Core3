public class Employee {
    private String name;
    private String position;
    private String phone;
    private double salary;
    private int age;
    private Manager manager;

    public Employee(String name, String position, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void startWork() {
        if (manager != null) {
            System.out.println(name + " не может приступить к работе без одобрения руководителя.");
        } else {
            System.out.println(name + " начал работу.");
        }
    }

    public void finishWork() {
        if (manager != null) {
            System.out.println(name + " не может закончить работу без одобрения руководителя.");
        } else {
            System.out.println(name + " закончил работу.");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", manager=" + (manager != null ? manager.getName() : "None") +
                '}';
    }

    protected void setSalary(double newSalary) {
    }

    public void displayInfo() {
    }
}
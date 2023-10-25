public class Main {
    public static void main(String[] args) {
        // Создаем несколько сотрудников.
        Employee employee1 = new Employee("Иван Петров", "Разработчик", "123-456-7890", 60000, 30);
        Employee employee2 = new Employee("Марина Сидорова", "Тестировщик", "987-654-3210", 55000, 35);
        Employee employee3 = new Employee("Алексей Иванов", "Дизайнер", "111-222-3333", 70000, 28);

        // Создаем руководителя и назначаем его сотрудникам.
        Manager manager = new Manager("Ольга Николаева", "Руководитель проекта", "555-123-4567", 90000, 40);
        employee1.setManager(manager);
        employee2.setManager(manager);
        employee3.setManager(manager);

        // Выводим информацию о сотрудниках.
        System.out.println();
        System.out.println("Информация о сотрудниках:");
        System.out.println("Сотрудник 1:");
        System.out.println(employee1);
        System.out.println("Сотрудник 2:");
        System.out.println(employee2);
        System.out.println("Сотрудник 3:");
        System.out.println(employee3);

        // Высчитываем среднюю зарплату и возраст среди сотрудников.
        Employee[] employees = {employee1, employee2, employee3};
        double averageSalary = calculateAverageSalary(employees);
        double averageAge = calculateAverageAge(employees);

        System.out.println();
        System.out.println("Средняя зарплата среди сотрудников: " + averageSalary);
        System.out.println("Средний возраст среди сотрудников: " + averageAge);

        // Повышаем зарплату сотрудникам старше 35 лет на 5000.
        increaseSalaryForEmployees(employees, 35, 5000);

        System.out.println();
        // Выводим информацию о сотрудниках после повышения зарплаты.
        System.out.println("Информация о сотрудниках после повышения зарплаты:");
        System.out.println("Сотрудник 1:");
        System.out.println(employee1);
        System.out.println("Сотрудник 2:");
        System.out.println(employee2);
        System.out.println("Сотрудник 3:");
        System.out.println(employee3);

        // Назначаем задачи руководителем.
        manager.assignTask(employee1, "Разработать новый функционал");
        manager.assignTask(employee2, "Провести тестирование");
        manager.assignTask(employee3, "Создать дизайн-макет");

        System.out.println();
        // Проверяем, может ли сотрудник начать работу и завершить работу.
        System.out.println("Попытка начать и завершить работу:");
        employee1.startWork();
        employee2.finishWork();
        employee3.startWork();
    }

    public static double calculateAverageSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employees.length;
    }

    public static double calculateAverageAge(Employee[] employees) {
        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.getAge();
        }
        return (double) totalAge / employees.length;
    }

    public static void increaseSalaryForEmployees(Employee[] employees, int ageThreshold, double increaseAmount) {
        for (Employee employee : employees) {
            if (employee.getAge() > ageThreshold) {
                employee.setSalary(employee.getSalary() + increaseAmount);
            }
        }
    }
}
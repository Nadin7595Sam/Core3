public class StatisticsCalculator {
    public double calculateAverageAge(Employee[] employees) {
        double totalAge = 0;
        for (int i = 0; i < employees.length; i++) {
            totalAge += employees[i].getAge();
        }
        return totalAge / employees.length;
    }

    public double calculateAverageSalary(Employee[] employees) {
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary / employees.length;
    }
}
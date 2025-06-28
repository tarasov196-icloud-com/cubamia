import java.util.Objects;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Гусев Никита Семенович", 1, 56000);
        employees[1] = new Employee("Петров Иван Петрович", 2, 53000);
        employees[2] = new Employee("Сидорова Анна Владимировна", 3, 55000);
        employees[3] = new Employee("Кузнецов Дмитрий Сергеевич", 4, 78000);
        employees[4] = new Employee("Смирнова Ольга Игоревна", 5, 44900);
        employees[5] = new Employee("Васильев Алексей Николаевич", 1, 90000);
        employees[6] = new Employee("Николаева Екатерина Дмитриевна", 2, 65000);
        employees[7] = new Employee("Федоров Михаил Андреевич", 3, 72000);
        employees[8] = new Employee("Алексеева Татьяна Павловна", 4, 48000);
        employees[9] = new Employee("Дмитриев Артем Викторович", 5, 90000);

        printAllEmployees();
        System.out.println("Сумма затрат на ЗП: " + calculateTotalSalary());
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Среднее значение зарплат: " + calculateAverageSalary());
        printAllEmployeesFullNames();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int calculateTotalSalary() {
        int total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        int minSalary = Integer.MAX_VALUE;

        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        int maxSalary = Integer.MIN_VALUE;

        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        int count = 0;
        int total = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
                count++;
            }
        }
        return count > 0 ? (double) total / count : 0;
    }

    public static void printAllEmployeesFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
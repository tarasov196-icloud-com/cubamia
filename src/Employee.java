import java.util.Objects;

public class Employee {
    private static int counter = 1;

    private final int id;
    private final String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        this.id = counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        if (department >= 1 && department <= 5) {
            this.department = department;
        } else {
            throw new IllegalArgumentException("Отдел должен быть от 1 до 5");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                department == employee.department &&
                salary == employee.salary &&
                Objects.equals(fullName, employee.fullName);
    }

    public int hashCode() {
        return Objects.hash(id, fullName, department, salary);
    }

    public String toString() {
        return "Employee{" + "id=" + id + ", fullName='" + fullName + '\'' + ", department=" + department + ", salary=" + salary + '}';
    }
}


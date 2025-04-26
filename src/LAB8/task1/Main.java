package LAB8.task1;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Yulia", 18, 1000);

        System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", employee.getName(), employee.getAge(), employee.getSalary());
    }
}

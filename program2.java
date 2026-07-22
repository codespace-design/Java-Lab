class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }
}
public class program2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 50000.0);
    }
    
}

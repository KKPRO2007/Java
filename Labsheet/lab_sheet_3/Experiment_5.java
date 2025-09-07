package lab_sheet_3;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        if (id <= 0 || name == null || salary <= 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Experiment_5 {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Ravi Kumar", 55000);

        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}

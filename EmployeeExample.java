class Employee {
    public void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
}

public class EmployeeExample {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.work();
    }
}


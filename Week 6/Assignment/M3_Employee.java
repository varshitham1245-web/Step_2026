public class M3_Employee {
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public M3_Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public M3_Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }

    public static void main(String[] args) {
        M3_Employee e1 = new M3_Employee("E-101", "Divya", 65000);
        M3_Employee e2 = new M3_Employee("E-102", "Arjun");
        e1.printProfile();
        e2.printProfile();
    }
}

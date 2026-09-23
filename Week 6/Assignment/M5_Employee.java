public class M5_Employee {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public M5_Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        M5_Employee e1 = new M5_Employee("Asha", 40000);
        M5_Employee e2 = new M5_Employee("Bala", 55000);
        M5_Employee e3 = new M5_Employee("Charan", 60000);
        M5_Employee.printCompanyInfo();
    }
}

public class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    public int totalCredits() {
        return credits + labCredits;
    }

    public static void main(String[] args) {
        Course course1 = new Course("21CSC201J", "Data Structures", 3, 1);
        Course course2 = new Course("21CSC205L", "Design and Analysis of Algorithms", 4);

        System.out.println("21CSC201J total credits: " + course1.totalCredits());
        System.out.println("21CSC205L total credits: " + course2.totalCredits());
    }
}

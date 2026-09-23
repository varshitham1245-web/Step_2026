public class AttendanceSheet {
    private String[] names;
    private int presentCount;

    public AttendanceSheet(int maxSize) {
        this.names = new String[maxSize];
        this.presentCount = 0;
    }

    public void markPresent(String studentName) {
        if (isPresent(studentName)) {
            System.out.println(studentName + " is already marked present.");
            return;
        }
        if (presentCount < names.length) {
            names[presentCount] = studentName;
            presentCount++;
            System.out.println(studentName + " marked present.");
        } else {
            System.out.println("Attendance sheet is full.");
        }
    }

    public int getPresentCount() {
        return this.presentCount;
    }

    public boolean isPresent(String studentName) {
        for (int i = 0; i < presentCount; i++) {
            if (names[i].equals(studentName)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");
        System.out.println("Present count: " + sheet.getPresentCount());
        System.out.println("Is Ben present? " + sheet.isPresent("Ben"));
        System.out.println("Is Chen present? " + sheet.isPresent("Chen"));
    }
}

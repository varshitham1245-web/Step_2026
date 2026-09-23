public class NameTag {
    public final String firstName;
    public final String lastName;

    public NameTag(String fullName) {
        String[] parts = fullName.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    public String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }

    public static void main(String[] args) {
        NameTag tag1 = new NameTag("Maria Gomez");
        System.out.println(tag1.getNickname());

        NameTag tag2 = new NameTag("John Doe");
        System.out.println(tag2.getNickname());
    }
}

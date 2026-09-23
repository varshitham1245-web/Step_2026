public class ReverseCustomerName {
    public static String reverseCustomerName(String customerName) {
        StringBuilder sb = new StringBuilder(customerName);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String name = "Sunil";
        String reversed = reverseCustomerName(name);
        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reversed);
    }
}

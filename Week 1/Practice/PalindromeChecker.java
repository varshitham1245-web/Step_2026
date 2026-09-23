public class PalindromeChecker {
    public static boolean isPalindromeIterative(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) return true;
        if (text.charAt(0) != text.charAt(text.length() - 1)) return false;
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        String reversed = new String(chars);
        return text.equals(reversed);
    }

    public static void main(String[] args) {
        String[] tests = {"madam", "hello"};
        for (String test : tests) {
            boolean iter = isPalindromeIterative(test);
            boolean rec = isPalindromeRecursive(test);
            boolean arr = isPalindromeArrayReversal(test);
            System.out.printf("Test: %s\n", test);
            System.out.printf("Iterative: %s | Recursive: %s | Array Reversal: %s\n", 
                iter ? "Palindrome" : "Not Palindrome",
                rec ? "Palindrome" : "Not Palindrome",
                arr ? "Palindrome" : "Not Palindrome");
        }
    }
}

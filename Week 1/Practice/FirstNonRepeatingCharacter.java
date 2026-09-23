import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeatingChar(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : text.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String[] tests = {"swiss", "aabbcc"};
        for (String test : tests) {
            char c = findFirstNonRepeatingChar(test);
            if (c == '\0') {
                System.out.println("No Non-Repeating Character Found");
            } else {
                System.out.println("First Non-Repeating Character: '" + c + "'");
            }
        }
    }
}

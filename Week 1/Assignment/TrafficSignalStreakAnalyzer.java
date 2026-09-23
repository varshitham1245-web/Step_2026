public class TrafficSignalStreakAnalyzer {
    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) return;
        
        char currentStreakChar = signalLog.charAt(0);
        int currentStreakLength = 1;
        
        char longestStreakChar = currentStreakChar;
        int maxStreakLength = 1;
        
        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i-1)) {
                currentStreakLength++;
            } else {
                if (currentStreakLength > maxStreakLength) {
                    maxStreakLength = currentStreakLength;
                    longestStreakChar = currentStreakChar;
                }
                currentStreakChar = signalLog.charAt(i);
                currentStreakLength = 1;
            }
        }
        
        if (currentStreakLength > maxStreakLength) {
            maxStreakLength = currentStreakLength;
            longestStreakChar = currentStreakChar;
        }
        
        System.out.printf("Longest Streak: '%c' repeated %d times\n", longestStreakChar, maxStreakLength);
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
        findLongestStreak("RRRRYYGG");
    }
}

import java.util.Arrays;

public class FantasyLeagueRankingEngine {
    
    static class Player implements Comparable<Player> {
        String name;
        int matchesPlayed;
        double battingAverage;
        boolean injured;

        public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        @Override
        public int compareTo(Player other) {
            // Sort descending by battingAverage
            return Double.compare(other.battingAverage, this.battingAverage);
        }
    }

    public static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    public static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    public static String draftAndRank(Player[] players) {
        // Filter draftable
        int draftableCount = 0;
        Player[] draftablePlayers = new Player[players.length];
        
        for (Player p : players) {
            // First check experience-only
            boolean draftable = false;
            if (isDraftable(p.matchesPlayed)) {
                draftable = true;
            } else if (isDraftable(p.matchesPlayed, p.injured)) {
                draftable = true;
            }
            
            if (draftable) {
                draftablePlayers[draftableCount++] = p;
            }
        }
        
        // Resize array
        Player[] finalDraftable = Arrays.copyOf(draftablePlayers, draftableCount);
        
        // Sort
        Arrays.sort(finalDraftable);
        
        // Format ranked output
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < finalDraftable.length; i++) {
            sb.append((i + 1)).append(". ").append(finalDraftable[i].name);
            if (i < finalDraftable.length - 1) {
                sb.append(" | ");
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };
        
        System.out.println(draftAndRank(players));
    }
}

import java.util.Random;

public class RockPaperScissors {
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Draw";
        }
        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Random random = new Random(42);
        String[] options = {"Rock", "Paper", "Scissors"};
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        
        System.out.println("Round | Player Move | Computer Move | Result");
        
        int wins = 0;
        int losses = 0;
        int draws = 0;
        
        for (int i = 0; i < 5; i++) {
            String pMove = playerMoves[i];
            String cMove = options[random.nextInt(3)];
            String result = playRound(pMove, cMove);
            
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
            
            System.out.printf("%d | %s | %s | %s\n", (i + 1), pMove, cMove, result);
        }
        
        double winPercentage = (wins * 100.0) / 5;
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%\n", wins, losses, draws, winPercentage);
    }
}

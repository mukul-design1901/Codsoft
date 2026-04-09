package Number_game;

public class Main {
    static void main() {
        Player player= new Player();
        boolean playAgain;

        do {
            Game game = new Game();
            if (game.playRound()){
                player.increaseScore();
            }
            playAgain = game.AskplayAgain();
        }while(playAgain);

        System.out.println("\nFinal Score: " + player.getScore());
        System.out.println("Thanks For Playing");
    }
}

package Number_game;

public class Player {
    private int score;

    public Player(){
        score = 0;
    }

    public void increaseScore(){
        score++;
    }

    public int getScore(){
        return score;
    }
}
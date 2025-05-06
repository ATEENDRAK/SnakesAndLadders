package Entity;

import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    Dice dice;
    int currentPlayerIndex = 0;

    public Game(Board board, List<Player> players, Dice dice) {
        this.board = board;
        this.players = players;
        this.dice = dice;

    }
    public void run(){
        for(Player player : players){
            player.currentPosition = board.getBoxes().getFirst();
        }
        while(true){
            Player player = players.get(currentPlayerIndex);
            System.out.println("player turn color "+ player.getColor());
            int diceVal = dice.throwDice();
            System.out.println("Dice val "+diceVal);
            player.currentPosition=board.getBoxes().get(player.currentPosition.num + diceVal);
            System.out.println("Player current position "+ player.currentPosition.getNum());
            //board.applySnakeAndLadder(player);
            if(player.currentPosition.num >= 100){
                System.out.println("Winner "+ player.color);
                return;
            }
            currentPlayerIndex = (currentPlayerIndex+1)%players.size();
        }
    }
}

package Entity;

import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    Dice dice;
    IWinningStrategy iWinningStrategy;
    IPlayerStartingPositionStrategy iPlayerStartingPositionStrategy;
    IFindNextPlayerStrategy iFindNextPlayerStrategy;
    int currentPlayerIndex;

    public Game(Board board, List<Player> players, Dice dice, IWinningStrategy iWinningStrategy,
                IPlayerStartingPositionStrategy iPlayerStartingPositionStrategy,
                IFindNextPlayerStrategy iFindNextPlayerStrategy) {
        this.board = board;
        this.players = players;
        this.dice = dice;
        this.iWinningStrategy = iWinningStrategy;
        this.iPlayerStartingPositionStrategy = iPlayerStartingPositionStrategy;
        this.iFindNextPlayerStrategy = iFindNextPlayerStrategy;
    }


    public void run(){
        for(Player player : players){
            iPlayerStartingPositionStrategy.setStartingPosition(player);
        }

        while(true){
            Player player = iFindNextPlayerStrategy.findNextPlayer(0, players);
            System.out.println("player turn color "+ player.getColor());
            int diceVal = dice.throwDice();
            System.out.println("Dice val "+diceVal);
            player.currentPosition=board.getBoxes().get(Math.min(player.currentPosition.num + diceVal,100));
            System.out.println("Player current position "+ player.currentPosition.getNum());
            board.apply(player);
            if(iWinningStrategy.isWinner(player)){
                System.out.println("Winner "+ player.color);
                return;
            }

        }
    }
}
